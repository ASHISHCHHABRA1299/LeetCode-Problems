package leetcode;

import java.util.Arrays;

public class HouseRobber {

	public static void main(String[] args) {

		int[] nums = { 1, 2, 3, 1 };
		int[] output = new int[nums.length];
		Arrays.fill(output, -1);
		int max = nums[0];
		output[0] = nums[0];
		for (int i = 1; i < output.length; i++) {
			int pos = i - 2;
			if (pos >= 0) {
				int max1 = 0;
				for (int j = pos; j >= 0; j--)
					max1 = Math.max(max1, output[j]);
				output[i] = nums[i] + max1;
			} else {
				output[i] = nums[i];
			}
			max = Math.max(output[i], max);
		}
		System.out.println(max);
	}

}
