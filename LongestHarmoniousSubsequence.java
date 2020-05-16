package leetcode;

import java.util.HashMap;

public class LongestHarmoniousSubsequence {

	public static void main(String[] args) {
		int[] nums = { 1, 3, 2, 2, 5, 2, 3, 7 };
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int num : nums)
			map.put(num, map.getOrDefault(num, 0) + 1);
		int res = 0;
		for (int val : map.keySet()) {
			if (map.containsKey(val + 1))
				res = Math.max(res, map.get(val) + map.get(val + 1));
		}
		System.out.println(res);

	}

}
