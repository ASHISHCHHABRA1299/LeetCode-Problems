package leetcode;

public class SurroundedRegions {

	public static void main(String[] args) {
		char[][] board = { { 'X', 'X', 'X', 'X' }, { 'X', 'O', 'O', 'X' }, { 'X', 'X', 'O', 'X' },
				{ 'X', 'O', 'X', 'X' } };
//		char[][] board2=new char[board.length][board[0].length];\
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				if (board[i][j] == 'X')
					board[i][j] = '1';
				else
					board[i][j] = '0';
			}
		}
		for (int j = 0; j < board[0].length; j++) {
			if (board[board.length - 1][j] == '0')
				zeroes(board, board.length - 1, j);
		}
		for (int i = board.length - 1; i >= 0; i--) {
			if (board[i][board[0].length - 1] == '0')
				zeroes(board, i, board[0].length - 1);
		}
		for (int j = board[0].length - 1; j >= 0; j--) {
			if (board[0][j] == '0')
				zeroes(board, 0, j);
		}
		for (int i = 0; i < board.length; i++) {
			if (board[i][0] == '0')
				zeroes(board, i, 0);
		}

		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				if (board[i][j] == '2')
					board[i][j] = 'O';
				else
					board[i][j] = 'X';
			}
		}
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void zeroes(char[][] board, int i, int j) {

		if (i < 0 || j < 0 || i >= board.length || j >= board[0].length || board[i][j] == '1' || board[i][j] == '2')
			return;
		board[i][j] = '2';
		zeroes(board, i + 1, j);
		zeroes(board, i - 1, j);
		zeroes(board, i, j + 1);
		zeroes(board, i, j - 1);
	}

}
