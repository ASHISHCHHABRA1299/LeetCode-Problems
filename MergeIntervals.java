package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class MergeIntervals {

	public static void main(String[] args) {
		Integer[][] intervals = { { 1, 3 }, { 2, 4 }, { 5, 7 }, { 6, 8 } };
//		Integer[][] intervals = { { 1, 4 }, { 1, 4 } };

		Arrays.sort(intervals, new Comparator<Integer[]>() {

			@Override
			public int compare(Integer[] o1, Integer[] o2) {
				return o1[0].compareTo(o2[0]);
			}
		});
		ArrayList<ArrayList<Integer>> l = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> l2;
		int k = 0;
		int i = k;
		while (i < intervals.length) {
			int flag = 0;
			l2 = new ArrayList<Integer>();
			int j = i + 1;

			while (j < intervals.length && (intervals[j][0] >= intervals[i][0] && intervals[j][0] <= intervals[i][1])) {
				k = j;
				flag = 1;
				j++;
			}
			if (flag == 1) {
				l2.add(intervals[i][0]);
				l2.add(intervals[k][1]);
			} else {
				l2.add(intervals[i][0]);
				l2.add(intervals[i][1]);
			}
//			System.out.println(l2);
			k++;
			i = k;
			l.add(l2);

		}
//		System.out.println(l);
		int[][] arr = new int[l.size()][2];
		for (int q = 0; q < arr.length; q++) {
			for (int r = 0; r < arr[0].length; r++) {
				arr[q][r] = l.get(q).get(r);
			}
		}
		for (int q = 0; q < arr.length; q++) {
			for (int r = 0; r < arr[0].length; r++) {
				System.out.print(arr[q][r] + " ");
			}
			System.out.println();
		}
	}

}
