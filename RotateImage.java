package leetcode;

public class RotateImage {

	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
//		int[][] matrix = { { 5, 1, 9, 11 }, { 2, 4, 8, 10 }, { 13, 3, 6, 7 }, { 15, 14, 12, 16 } };
		int n = matrix.length;
//		int flag = 0;
//		if (n / 2 == 1)
//			flag = 1;
//		for (int i = 0; i < n / 2; i++) {
//			for (int j = 0; j < n; j++) {
//				int temp = matrix[i][j];
//				matrix[i][j] = matrix[j][n - 1 - i];
//				matrix[j][n - 1 - i] = temp;
//			}
//		}
//		if (flag == 1) {
//			int k = n / 2;
//			for (int j = 0; j < k; j++) {
//				int temp = matrix[k][j];
//				matrix[k][j] = matrix[n - 1 - j][k];
//				matrix[n - 1 - j][k] = temp;
//			}
//		}

		// transpose
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i < j) {
					int temp = matrix[i][j];
					matrix[i][j] = matrix[j][i];
					matrix[j][i] = temp;
				}
			}
		}
		// reverse each row elements
		for (int i = 0; i < matrix.length; i++) {
			int start = 0;
			int end = n - 1;
			while (start < end) {
				int temp = matrix[i][start];
				matrix[i][start] = matrix[i][end];
				matrix[i][end] = temp;
				start++;
				end--;
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
