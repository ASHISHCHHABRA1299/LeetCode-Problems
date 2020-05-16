package leetcode;

public class UniquePathsII {

	public static void main(String[] args) {
		int[][] grid = { { 0, 0, 0 }, { 0, 1, 0 }, { 0, 0, 0 } };
		System.out.println(uniquepath2(grid));
		System.out.println(uniquepath(grid, 0, 0));
		System.out.println(uniquepathTD(grid, 0, 0, new int[grid.length][grid[0].length]));
		System.out.println(uniquepathBU(grid));
	}

	// working
	private static int uniquepath2(int[][] grid) {
		if (grid[0][0] == 1)
			return 0;
		grid[0][0] = 1;
		for (int i = 1; i < grid[0].length; i++) {
			grid[0][i] = grid[0][i] == 0 ? grid[0][i - 1] : 0;
		}
		for (int i = 1; i < grid.length; i++) {
			grid[i][0] = grid[i][0] == 0 ? grid[i - 1][0] : 0;
		}

		for (int i = 1; i < grid.length; i++) {
			for (int j = 1; j < grid[0].length; j++) {
				grid[i][j] = grid[i][j] == 0 ? (grid[i - 1][j] + grid[i][j - 1]) : 0;
			}
		}
		return grid[grid.length - 1][grid[0].length - 1];
	}

	private static int uniquepath(int[][] grid, int i, int j) {
		if (i == grid.length - 1 && j == grid[0].length - 1) {
			return 1;
		}
		if (i > grid.length - 1 || j > grid[0].length - 1 || grid[i][j] == 1) {
			return 0;
		}
		// right
		int ch = uniquepath(grid, i, j + 1);
		// down
		int cv = uniquepath(grid, i + 1, j);
		return cv + ch;
	}

	private static int uniquepathTD(int[][] grid, int i, int j, int[][] strg) {
		if (i == grid.length - 1 && j == grid[0].length - 1) {
			return 1;
		}
		if (i > grid.length - 1 || j > grid[0].length - 1 || grid[i][j] == 1) {
			return 0;
		}
		if (strg[i][j] != 0)
			return strg[i][j];
		// right
		int ch = uniquepathTD(grid, i, j + 1, strg);
		// down
		int cv = uniquepathTD(grid, i + 1, j, strg);
		return strg[i][j] = cv + ch;
	}

	private static int uniquepathBU(int[][] grid) {
		int[][] strg = new int[grid.length + 1][grid[0].length + 1];
		strg[grid.length - 1][grid[0].length - 1] = 1;
		for (int i = grid.length - 1; i >= 0; i--) {
			for (int j = grid[0].length - 1; j >= 0; j--) {
				if (i == grid.length - 1 && j == grid[0].length - 1)
					continue;
				if (grid[i][j] == 0) {
					strg[i][j] = strg[i + 1][j] + strg[i][j + 1];
				} else {
					strg[i][j] = 0;
				}
			}
		}
		return strg[0][0];
	}
}
