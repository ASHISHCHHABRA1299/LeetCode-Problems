package leetcode;

public class NumberOfIslands {

	public static void main(String[] args) {
		char[][] grid = { { '1', '1', '1', '1', '0' }, { '1', '1', '0', '1', '0' }, { '1', '1', '0', '0', '0' },
				{ '0', '0', '0', '0', '0' } };

		boolean[][] gridvalue = new boolean[grid.length][grid[0].length];
		int count = 0;

		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {

				if (grid[i][j] == '0')
					continue;
				if (grid[i][j] == '1' && gridvalue[i][j] == false) {
					count++;
					alltheones(grid, i, j, gridvalue);

				}

			}
		}
		System.out.println(count);
	}

	public static void alltheones(char[][] grid, int i, int j, boolean[][] gridvalue) {
		if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == '0'||gridvalue[i][j])
			return;

		gridvalue[i][j] = true;
		alltheones(grid, i + 1, j, gridvalue);
		alltheones(grid, i - 1, j, gridvalue);
		alltheones(grid, i, j + 1, gridvalue);
		alltheones(grid, i, j - 1, gridvalue);

	}

}
