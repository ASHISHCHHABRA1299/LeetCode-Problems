package leetcode;

public class UniquePaths {

	public static void main(String[] args) {
		int m = 7, n = 3;
		int[][] arr = new int[n][m];
		int[][] strg = new int[arr.length][arr[0].length];
		System.out.println(paths(arr, 0, 0, strg));
		System.out.println(pathbu(arr));
	}

	public static int paths(int[][] arr, int row, int col, int[][] strg) {
		if (row == arr.length - 1 && col == arr[0].length - 1)
			return 1;
		if (col > arr[0].length - 1)
			return 0;
		if (row > arr.length - 1)
			return 0;
		if (strg[row][col] != 0)
			return strg[row][col];
		int c = 0;
		// right
		c += paths(arr, row, col + 1, strg);
		// down
		c += paths(arr, row + 1, col, strg);
		return strg[row][col] = c;
	}

	public static int pathbu(int[][] arr) {
		int n = arr.length;
		int m = arr[0].length;
		int[][] dp = new int[n + 1][m + 1];
		dp[n - 1][m - 1] = 1;
		for (int i = n - 1; i >= 0; i--) {
			for (int j = m - 1; j >= 0; j--) {
				if (i == n - 1 && j == m - 1)
					continue;
				dp[i][j] = dp[i][j + 1] + dp[i + 1][j];
			}
		}
		return dp[0][0];
	}
}
