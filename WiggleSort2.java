package leetcode;

import java.util.Arrays;

public class WiggleSort2 {

	public static void main(String[] args) {
//		int[] nums = { 1, 5, 1, 1, 6, 4 };
		int[] nums = { 1, 2, 2, 1, 2, 1, 1, 1, 1, 2, 2, 2 };
//		int idx = nums.length - 1;
//		int[] vals = Arrays.copyOf(nums, nums.length);
//		Arrays.sort(vals);
//		for (int i = 1; i < nums.length; i += 2)
//			nums[i] = vals[idx--];
//		for (int i = 0; i < nums.length; i += 2)
//			nums[i] = vals[idx--];
		// check for every second element
		for (int i = 0; i < nums.length; i += 2) {

			// check for the left element
			if (i > 0 && nums[i - 1] < nums[i]) {
				int temp = nums[i - 1];
				nums[i - 1] = nums[i];
				nums[i] = temp;
			}
			// check for the right element
			if (i < nums.length - 1 && nums[i] > nums[i + 1]) {
				int temp = nums[i + 1];
				nums[i + 1] = nums[i];
				nums[i] = temp;
			}
		}
		for (int val : nums)
			System.out.print(val + " ");
	}

}
