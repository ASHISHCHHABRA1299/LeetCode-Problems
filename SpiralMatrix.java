package leetcode;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

	public static void main(String[] args) {
		int[][] array = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int rowmin = 0;
		int rowmax = array.length - 1;
		int colmin = 0;
		int colmax = array[0].length - 1;
		int count = 0;
		int nel = array.length * array[0].length;
		List<Integer> l = new ArrayList<Integer>();
		while (count < nel) {
			// first col
			for (int c = colmin; c <= colmax && count < nel; c++) {
				l.add(array[rowmin][c]);
				count++;
			}
			rowmin++;
			// last row
			for (int r = rowmin; r <= rowmax && count < nel; r++) {
				l.add(array[r][colmax]);
				count++;
			}
			colmax--;
			// lastcol
			for (int c = colmax; c >= colmin && count < nel; c--) {
				l.add(array[rowmax][c]);
				count++;

			}
			rowmax--;
			// firstrow
			for (int r = rowmax; r >= rowmin && count < nel; r--) {
				l.add(array[r][colmin]);
				count++;
			}
			colmin++;
		}

		System.out.println(l);
	}

}
