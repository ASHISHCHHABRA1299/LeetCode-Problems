package leetcode;

public class CountSquareSubmatricesWithAllOnes {

	public static void main(String[] args) {
		int[][] matrix = { { 1,0,1 }, { 1,1,0 }, {1,1,0} };
		int[][] dp = new int[matrix.length + 1][matrix[0].length + 1];
		int finalans = 0;
		for (int i = 1; i < dp.length; i++) {
			for (int j = 1; j < dp[i].length; j++) {
				if (matrix[i - 1][j - 1] == 1) {
					dp[i][j] = Math.min(dp[i - 1][j], Math.min(dp[i][j - 1], dp[i - 1][j - 1])) + 1;
					finalans += dp[i][j];
				}
			}
		}
		System.out.println(finalans);

	}

}
