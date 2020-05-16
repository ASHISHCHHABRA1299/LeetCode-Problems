package leetcode;

import java.util.ArrayList;
import java.util.List;

public class LuckyNumbersInAMatrix {

	public static void main(String[] args) {
		int[][] matrix = { { 3, 7, 8 }, { 9, 11, 13 }, { 15, 16, 17 } };
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < matrix.length; i++) {
			int min = Integer.MAX_VALUE;
			int index = -1;
			for (int j = 0; j < matrix[0].length; j++) {
				if (matrix[i][j] < min) {
					min = matrix[i][j];
					index = j;
				}
			}

			int max = Integer.MIN_VALUE;
			for (int j = 0; j < matrix.length; j++) {
				if (matrix[j][index] > max)
					max = matrix[j][index];
			}

			if (max == min)
				list.add(max);
		}
		System.out.println(list);

	}

}
