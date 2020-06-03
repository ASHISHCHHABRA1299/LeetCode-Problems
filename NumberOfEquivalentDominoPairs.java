package leetcode;

import java.util.HashMap;

public class NumberOfEquivalentDominoPairs {

	public static void main(String[] args) {
		int[][] d = { { 1, 2 }, { 1, 2 }, { 3, 4 }, { 1, 2 } };
		HashMap<String, Integer> count = new HashMap<String, Integer>();
		for (int[] o : d) {
			int a = Math.min(o[0], o[1]);
			int b = Math.max(o[0], o[1]);
			count.put(a + "" + b, count.getOrDefault(a + "" + b, 0) + 1);
		}
		int ans = 0;
		for (int val : count.values()) {
			ans += val * (val - 1) / 2;
		}
		System.out.println(ans);
	}

}
