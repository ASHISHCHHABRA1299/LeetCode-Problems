package leetcode;

public class WordSearch {

	public static void main(String[] args) {
		char[][] board = { { 'A', 'B', 'C', 'E' }, { 'S', 'F', 'C', 'S' }, { 'A', 'D', 'E', 'E' } };
		String word = "SEE";
		boolean ans = false;
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				if (board[i][j] == word.charAt(0))
					ans = ans || search(board, word, 0, i, j, new boolean[board.length][board[0].length]);
			}
		}
		System.out.println(ans);

	}

	public static boolean search(char[][] board, String word, int idx, int row, int col, boolean[][] visited) {
		if (idx == word.length())
			return true;
		if (row < 0 || row >= board.length || col < 0 || col >= board[0].length || visited[row][col])
			return false;
		if (board[row][col] != word.charAt(idx))
			return false;
		visited[row][col] = true;
		// top
		boolean t = search(board, word, idx + 1, row - 1, col, visited);
		if(t)
			return t;
		// left
		boolean l = search(board, word, idx + 1, row, col - 1, visited);
		if(l)
			return l;
		// right
		boolean r = search(board, word, idx + 1, row, col + 1, visited);
		if(r)
			return r;
		// bottom
		boolean b = search(board, word, idx + 1, row + 1, col, visited);
		if(b)
			return b;
		visited[row][col] = false;
		return t || b || r || l;
	}

}
