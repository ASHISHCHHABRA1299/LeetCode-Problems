package leetcode;

public class SquaresOfASortedArray {

	public static void main(String[] args) {
//		int[] A = { -4, -1, 0, 3, 10 };
		int[] A = { -7, -3, 2, 3, 11 };
		int[] B = new int[A.length];
		int index = -1;
		for (int i = 0; i < A.length; i++) {
			if (A[i] < 0)
				index++;
		}

		int c = 0, j = index + 1;
		while (index >= 0 && j < A.length) {
			if (A[index] * A[index] < A[j] * A[j]) {
				B[c] = A[index] * A[index];
				c++;
				index--;
			} else {
				B[c] = A[j] * A[j];
				c++;
				j++;
			}
		}

		while (index >= 0) {
			B[c] = A[index] * A[index];
			c++;
			index--;
		}
		while (j < A.length) {

			B[c] = A[j] * A[j];
			c++;
			j++;
		}
		for (int val : B)
			System.out.print(val + " ");
	}

}
