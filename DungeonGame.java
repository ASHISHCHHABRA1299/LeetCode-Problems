package leetcode;

public class DungeonGame {

	public static void main(String[] args) {
//		int[][] d = { { -2, -3, 3 }, { -5, -10, 1 }, { 10, 30, -5 } };
		int[][] d = { { 0, -3 } };
		int m = d.length;
		int n = d[0].length;

		int[][] dp = new int[m][n];

		dp[m - 1][n - 1] = Math.max(1 - d[m - 1][n - 1], 1);
		for (int i = m - 2; i >= 0; i--) {
			dp[i][n - 1] = Math.max(1, dp[i + 1][n - 1] - d[i][n - 1]);
		}
		for (int i = n - 2; i >= 0; i--) {
			dp[m - 1][i] = Math.max(1, dp[m - 1][i + 1] - d[m - 1][i]);
		}
		for (int i = m - 2; i >= 0; i--) {
			for (int j = n - 2; j >= 0; j--) {
				dp[i][j] = Math.max(1, Math.min(dp[i + 1][j], dp[i][j + 1]) - d[i][j]);
			}
		}

		for (int i = 0; i < dp.length; i++) {
			for (int j = 0; j < dp[0].length; j++) {
				System.out.print(dp[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println(dp[0][0]);

	}

}
