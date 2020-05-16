package leetcode;

import java.util.ArrayList;
import java.util.Arrays;


public class MergeIntervals2 {

	public static void main(String[] args) {
//		int[][] intervals = { { 1, 3 }, { 2, 6 }, { 8, 10 }, { 15, 18 } };
		int[][] intervals = { { 1, 4 }, { 1, 4 } };
//		Collections.sort(Arrays.asList(intervals), new ArrayComparator());
		Arrays.sort(intervals, new ArrayComparator());
		ArrayList<int[]> list = new ArrayList<int[]>();	
		int i = -1;
		for (int[] interval : intervals) {
			if (list.isEmpty() || list.get(i)[1] < interval[0]) {
				i++;
				list.add(interval);
			} else {
				list.get(i)[1] = Math.max(list.get(i)[1], interval[1]);
			}
		}
		int[][] arr = list.toArray(new int[list.size()][2]);
		for (int r = 0; r < arr.length; r++) {
			for (int c = 0; c < arr[0].length; c++) {
				System.out.print(arr[r][c] + " ");
			}
			System.out.println();
		}

	}

}
