package leetcode;

public class SpiralMatrixII {

	public static void main(String[] args) {
		int n = 3;
		int[][] matrix = new int[n][n];
		int count = 1;
		int nel = n * n;
		int rowmin = 0;
		int rowmax = matrix.length - 1;
		int colmin = 0;
		int colmax = matrix[0].length - 1;
		while (count <= nel) {
			for (int i = colmin; i <= colmax && count <= nel; i++) {
				matrix[rowmin][i] = count;
				count++;
			}
			rowmin++;
			for (int i = rowmin; i <= rowmax && count <= nel; i++) {
				matrix[i][colmax] = count;
				count++;
			}
			colmax--;
			for (int i = colmax; i >= colmin && count <= nel; i--) {
				matrix[rowmax][i] = count;
				count++;
			}
			rowmax--;
			for (int i = rowmax; i >= rowmin && count <= nel; i--) {
				matrix[i][colmin] = count;
				count++;
			}
			colmin++;
		}

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}

	}

}
