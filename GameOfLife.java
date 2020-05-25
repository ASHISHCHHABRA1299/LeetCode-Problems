package leetcode;

public class GameOfLife {

	public static void main(String[] args) {
		int[][] board = { { 0, 1, 0 }, { 0, 0, 1 }, { 1, 1, 1 }, { 0, 0, 0 } };
		int[] neighbours = { 0, 1, -1 };
		int[][] copy = new int[board.length][board[0].length];
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				copy[i][j] = board[i][j];
			}
		}
		for (int row = 0; row < board.length; row++) {
			for (int col = 0; col < board[row].length; col++) {
				int lives = 0;
				for (int i = 0; i < 3; i++) {
					for (int j = 0; j < 3; j++) {
						if (!(neighbours[i] == 0 && neighbours[j] == 0)) {
							int r = row + neighbours[i];
							int c = col + neighbours[j];
							if ((r < board.length && r >= 0) && (c < board[0].length && c >= 0) && (copy[r][c] == 1))
								lives += 1;
						}
					}
				}
				if ((copy[row][col] == 1) && (lives < 2 || lives > 3))
					board[row][col] = 0;
				if ((copy[row][col] == 0) && lives == 3)
					board[row][col] = 1;
			}
		}
		for (int[] co : board) {
			for (int val : co) {
				System.out.print(val + " ");
			}
			System.out.println();
		}
	}

}
