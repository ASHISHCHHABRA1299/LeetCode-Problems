package leetcode;

public class ValidSudoko {

	public static void main(String[] args) {
		char[][] board = {
				{ '5', '3', '.', '.', '7', '.', '.', '.', '.' },
				{ '6', '.', '.', '1', '9', '5', '.', '.', '.' },
				{ '.', '9', '8', '.', '.', '.', '.', '6', '.' },
				{ '8', '.', '.', '.', '6', '.', '.', '.', '3' },
				{ '4', '.', '.', '8', '.', '3', '.', '.', '1' },
				{ '7', '.', '.', '.', '2', '.', '.', '.', '6' },
				{ '.', '6', '.', '.', '.', '.', '2', '8', '.' },
				{ '.', '.', '.', '4', '1', '9', '.', '.', '5' },
				{ '.', '.', '.', '.', '8', '.', '.', '7', '9' } };
		boolean finalans = true;

		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				if (board[i][j] == '.')
					continue;
				boolean ans1 = checkbyrow(board, i, j);
				boolean ans2 = checkbycolumn(board, i, j);
				boolean ans3 = checkbybox(board, i, j);
				finalans = finalans & (ans1 & ans2 & ans3);
			}
		}
		System.out.println(finalans);
	}
	
	public static boolean checkbyrow(char[][] board, int i, int j) {

		for (int k = 0; k < board.length; k++) {
			if (i == k)
				continue;
			if (board[k][j] == board[i][j]) {
				return false;
			}
		}
		return true;
	}

	public static boolean checkbycolumn(char[][] board, int i, int j) {

		for (int k = 0; k < board.length; k++) {
			if (j == k)
				continue;
			if (board[i][k] == board[i][j]) {
				return false;
			}
		}
		return true;
	}

	public static boolean checkbybox(char[][] board, int i, int j) {

		int row = i - (i % 3);
		int col = j - (j % 3);
		int row1 = row + 3;
		int col1 = col + 3;
		for (int m = row; m < row1; m++) {
			for (int n = col; n < col1; n++) {
				if (n == j && m == i)
					continue;
				if (board[m][n] == board[i][j])
					return false;
			}
		}
		return true;
	}
}
