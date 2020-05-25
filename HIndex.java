package leetcode;

import java.util.Arrays;

public class HIndex {

	public static void main(String[] args) {
		int[] nums = {100};
		Arrays.sort(nums);
		int res = 0;
		for (int i = nums.length - 1; i >= 0; i--) {
			int val = nums.length - i;
			if (nums[i] >= val) {
				res = val;
			} else
				break;
		}
		System.out.println(res);

	}

}
