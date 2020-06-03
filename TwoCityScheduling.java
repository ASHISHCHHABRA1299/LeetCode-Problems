package leetcode;

import java.util.Arrays;
import java.util.Comparator;

public class TwoCityScheduling {

	class comp implements Comparator<int[]> {

		@Override
		public int compare(int[] o1, int[] o2) {
			return Math.abs(o2[1] - o2[0]) - Math.abs(o1[1] - o1[0]);
		}

	}

	public static void main(String[] args) {
		int[][] costs = { { 259, 770 }, { 448, 54 }, { 926, 667 }, { 184, 139 }, { 840, 118 }, { 577, 469 } };
		TwoCityScheduling two = new TwoCityScheduling();
		Arrays.sort(costs, two.new comp());
		int counta = 0, countb = 0, res = 0;
		int n = costs.length / 2;
		for (int i = 0; i < costs.length; i++) {
			if (counta < n && countb < n) {
				if (costs[i][0] < costs[i][1]) {
					counta++;
					res += costs[i][0];
				} else {
					countb++;
					res += costs[i][1];
				}
			} else if (counta < n) {
				counta++;
				res += costs[i][0];
			} else if (countb < n) {

				countb++;
				res += costs[i][1];
			}
		}
		System.out.println(res);
	}

}
