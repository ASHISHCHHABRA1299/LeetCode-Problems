package leetcode;

public class MinimumPathSumMatrix {

	public static void main(String[] args) {
		int[][] grid = { { 1, 3, 1 }, { 1, 5, 1 }, { 4, 2, 1 } };
//		int[][] grid = { { 1 } };
//		minsum(grid, 0, 0, 0);
//		System.out.println(minimum);
		for (int i = 1; i < grid[0].length; i++) {
			grid[0][i] = grid[0][i] + grid[0][i - 1];
		}
		for (int j = 1; j < grid.length; j++) {
			grid[j][0] = grid[j][0] + grid[j - 1][0];
		}
		for (int i = 1; i < grid.length; i++) {
			for (int j = 1; j < grid[0].length; j++) {
				grid[i][j] = Math.min(grid[i][j] + grid[i][j - 1], grid[i][j] + grid[i - 1][j]);
			}
		}
		System.out.println(grid[grid.length - 1][grid[0].length - 1]);
	}

	static int minimum = Integer.MAX_VALUE;

	private static void minsum(int[][] grid, int row, int col, int sum) {
		if (row == grid.length - 1 && col == grid[0].length - 1) {
			sum += grid[grid.length - 1][grid[0].length - 1];
			minimum = Math.min(sum, minimum);
			return;
		}
		if (row >= grid.length || col >= grid[0].length)
			return;
		sum = sum + grid[row][col];
		// right
		minsum(grid, row, col + 1, sum);
		// down
		minsum(grid, row + 1, col, sum);
//		sum = sum - grid[row][col];
	}

}
