package leetcode;

import java.util.ArrayList;
import java.util.List;

public class IntervalListIntersections {

	public static void main(String[] args) {
		int[][] A = { { 0, 2 }, { 5, 10 }, { 13, 23 }, { 24, 25 } };
		int[][] B = { { 1, 5 }, { 8, 12 }, { 15, 24 }, { 25, 26 } };
		int i = 0;
		int j = 0;
		List<Integer> list = new ArrayList<Integer>();
		while (i < A.length && j < B.length) {
			if (A[i][0] > B[j][1]) {
				j++;
			} else if (A[i][1] < B[j][0]) {
				i++;
			} else {
				list.add(Math.max(A[i][0], B[j][0]));
				list.add(Math.min(A[i][1], B[j][1]));
				if (A[i][1] < B[j][1])
					i++;
				else
					j++;
			}
		}
		int s = 0;
		int[][] output = new int[list.size() / 2][2];
		for (int k = 0; k < output.length; k++) {
			for (int l = 0; l < 2; l++) {
				output[l][k] = list.get(s);
				s++;
			}
		}
	}

}
