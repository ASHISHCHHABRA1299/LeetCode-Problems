package leetcode;

import java.util.HashMap;

public class DegreeOfAnArray {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 2, 3, 1, 4, 2 };
		HashMap<Integer, Integer> left = new HashMap<Integer, Integer>(), right = new HashMap<Integer, Integer>(),
				count = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			if (left.get(nums[i]) == null)
				left.put(nums[i], i);
			right.put(nums[i], i);
			count.put(nums[i], count.getOrDefault(nums[i], 0) + 1);
		}
		int max = Integer.MIN_VALUE;
		for (int x : count.values())
			max = Math.max(max, x);
		int ans = nums.length;
		for (int x : count.keySet()) {
			if (count.get(x) == max)
				ans = Math.min(ans, right.get(x) - left.get(x) + 1);
		}
		System.out.println(ans);

	}

}
