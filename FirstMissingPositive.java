package leetcode;

import java.util.Arrays;

public class FirstMissingPositive {

	public static void main(String[] args) {
		int[] nums = {7,8,9,11,12};
		int val = 1;
		Arrays.sort(nums);
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == val)
				val++;
		}
		System.out.println(val);

	}

}
