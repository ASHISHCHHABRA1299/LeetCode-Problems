package leetcode;

public class IslandPerimeter {

	public static void main(String[] args) {
		int[][] grid = { { 0, 1, 0, 0 }, { 1, 1, 1, 0 }, { 0, 1, 0, 0 }, { 1, 1, 0, 0 } };
		int noofone = 0;
		int noofedges = 0;
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				if (grid[i][j] == 1) {
					noofone++;
					if (i != 0 && grid[i - 1][j] == 1)
						noofedges++;
					if (j != 0 && grid[i][j - 1] == 1)
						noofedges++;
				}
			}
		}

		System.out.println(4 * noofone - 2 * noofedges);

	}

}
