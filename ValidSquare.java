package leetcode;

import java.util.Arrays;
import java.util.Comparator;

public class ValidSquare {

	public static void main(String[] args) {
		int[] p1 = { 0, 0 };
		int[] p2 = { 1, 1 };
		int[] p3 = { 1, 0 };
		int[] p4 = { 0, 1 };
		int[][] p = { p1, p2, p3, p4 };
		Arrays.sort(p, new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				if (o1[0] == o2[0])
					return o1[1] - o2[1];
				return o1[0] - o2[0];
			}
		});

		System.out.println(
				dist(p[0], p[1]) != 0 && dist(p[0], p[1]) == dist(p[1], p[3]) && dist(p[1], p[3]) == dist(p[3], p[2])
						&& dist(p[3], p[2]) == dist(p[2], p[0]) && dist(p[0], p[3]) == dist(p[1], p[2]));

	}

	private static double dist(int[] p1, int[] p2) {
		return (p2[1] - p1[1]) * (p2[1] - p1[1]) + (p2[0] - p1[0]) * (p2[0] - p1[0]);
	}

}
