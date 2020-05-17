package leetcode;

import java.util.HashMap;

public class NumberOfBoomerangs {

	public static void main(String[] args) {
		int[][] points = { { 0, 0 }, { 1, 0 }, { 2, 0 } };
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int res = 0;
		for (int i = 0; i < points.length; i++) {
			for (int j = 0; j < points.length; j++) {
				if (i == j)
					continue;
				int dist = getdistance(points[i], points[j]);
				map.put(dist, map.getOrDefault(dist, 0) + 1);

			}
			for (int val : map.values())
				res += val * (val - 1);
			map.clear();
		}
		System.out.println(res);

	}

	private static int getdistance(int[] point1, int[] point2) {
		int dx = point1[0] - point2[0];
		int dy = point1[1] - point2[1];
		return dx * dx + dy * dy;
	}

}
