package leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class SingleNumberII {

	public static void main(String[] args) {
		int[] nums = { -2, -2, 1, 1, -3, 1, -3, -3, -4, -2 };
//		Set<Integer> set = new HashSet<Integer>();
//		for (int i = 0; i < nums.length; i++) {
//			if (nums[i] < 0) {
//				nums[i] = -nums[i];
//				set.add(nums[i]);
//			}
//		}
//		int[] arr = new int[64];
//		for (int i = 0; i < nums.length; i++) {
//			int ans = nums[i];
//			int count = 0;
//			while (ans != 0) {
//				if ((ans & 1) == 1)
//					arr[count] += 1;
//				count++;
//				ans = ans >> 1;
//			}
//		}
//		for (int i = 0; i < arr.length; i++)
//			arr[i] = arr[i] % 3;
//		int mul = 1;
//		int number = 0;
//		for (int i = 0; i < arr.length; i++) {
//
//			if (arr[i] == 1)
//				number += mul;
//			mul = mul * 2;
//		}
//		if (set.contains(number))
//			number *= -1;
//		System.out.println(number);

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int val : nums) {
			map.put(val, map.getOrDefault(val, 0) + 1);
		}
		int ans = 0;
		for (int val : map.keySet()) {
			if (map.get(val) == 1) {
				ans = val;
				break;
			}
		}
		System.out.println(ans);
	}

}
