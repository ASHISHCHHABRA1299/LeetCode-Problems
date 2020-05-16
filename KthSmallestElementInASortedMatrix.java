package leetcode;

import java.util.Arrays;

public class KthSmallestElementInASortedMatrix {

	public static void main(String[] args) {
		int[][] matrix = { { 1, 2 }, { 1, 3 } };
		int k = 1;
		int l = 0;
		int[] arr = new int[matrix.length * matrix[0].length];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				arr[l] = matrix[i][j];
				l++;
			}
		}
//		for (int val : arr)
//			System.out.print(val + " ");
//		System.out.println();
		Arrays.sort(arr);
//		for (int val : arr)
//			System.out.print(val + " ");
//		System.out.println();
		System.out.println(arr[k - 1]);

	}

}
