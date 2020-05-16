package leetcode;

import java.util.LinkedList;

public class ReshapeTheMatrix {

	public static void main(String[] args) {
		int[][] nums = { { 1, 2 }, { 3, 4 } };
		int r = 1, c = 4;
		int[][] output = new int[r][c];
		LinkedList<Integer> list = new LinkedList<Integer>();
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				list.add(nums[i][j]);
			}
		}
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				output[i][j] = list.remove();
			}
		}
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				System.out.print(output[i][j] + " ");
			}
			System.out.println();
		}
	}

}
