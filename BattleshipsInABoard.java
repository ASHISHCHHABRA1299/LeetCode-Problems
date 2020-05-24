package leetcode;

public class BattleshipsInABoard {

	public static void main(String[] args) {
		char[][] board = { { 'X', '.', '.', 'X' }, { '.', '.', '.', 'X' }, { '.', '.', '.', 'X' } };
		int noofbattle = 0;
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				if (board[i][j] == 'X') {
					noofbattle++;
					battle(board, i, j);
				}
			}
		}
		System.out.println(noofbattle);
	}

	private static void battle(char[][] board, int i, int j) {
		if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] != 'X')
			return;
		board[i][j] = '.';
		battle(board, i + 1, j);
		battle(board, i - 1, j);
		battle(board, i, j + 1);
		battle(board, i, j - 1);
	}

}
