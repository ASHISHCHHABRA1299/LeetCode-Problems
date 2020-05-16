package leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class MajorityELement {
	// brute force keep track of each element
	// hashmap
	// sorting
	// moore voting algorithm

	public static void main(String[] args) {
		int[] nums = { 2, 2, 1, 1, 1, 2, 2 };
//		if (nums.length == 1) {
//			System.out.println(nums[0]);
//			return;
//		}
		// int[] nums = { 3, 2, 3 };
//		int n = nums.length / 2;
//		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
//		for (int i = 0; i < nums.length; i++) {
//			int val = map.getOrDefault(nums[i], 0) + 1;
//			map.put(nums[i], val);
//		}
//		for (int key : map.keySet()) {
//			if (map.get(key) > n)
//				System.out.println(key);
//		}
//		Arrays.sort(nums);
//		System.out.println(nums[nums.length / 2]);
		int count = 0;
		int candidate = 0;
		for (int i = 0; i < nums.length; i++) {
			if (count == 0) {
				candidate = nums[i];
			} else {
				if (nums[i] == candidate)
					count++;
				else
					count--;
			}
		}

		int limit = nums.length / 2;
		int c = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == candidate)
				c++;
		}
		if (c >= limit)
			System.out.println(candidate);

	}

}
