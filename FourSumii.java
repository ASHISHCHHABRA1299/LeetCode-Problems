package leetcode;

import java.util.HashMap;

public class FourSumii {

	public static void main(String[] args) {
		int count = 0;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int[] A = { 1, 2 };
		int[] B = { -2, -1 };
		int[] C = { -1, 2 };
		int[] D = { 0, 2 };
		for (int a : A) {
			for (int b : B) {
				int sum = a + b;
				if (map.containsKey(sum))
					map.put(sum, map.get(sum) + 1);
				else
					map.put(sum, 1);
			}
		}
		for (int c : C) {
			for (int d : D) {
				int sum = c + d;
				if (map.containsKey(-sum))
					count += map.get(-sum);
			}
		}
		System.out.println(count);
	}

}
