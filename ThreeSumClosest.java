package leetcode;

import java.util.Arrays;

public class ThreeSumClosest {

	public static void main(String[] args) {
		int[] nums = { -1, 2, 1, -4 };
		int target = 1;
		System.out.println(threesumclosest(nums, target));

	}

	private static int threesumclosest(int[] nums, int target) {
		int i = 0;
		Arrays.sort(nums);
		int mindiff = nums[0] + nums[1] + nums[nums.length - 1];
		while (i <= nums.length - 3) {
			int j = i + 1;
			int k = nums.length - 1;
			while (j < k) {
				int curr_sum = nums[i] + nums[j] + nums[k];
				if (curr_sum > target)
					k--;
				else
					j++;
				if (Math.abs(curr_sum - target) < Math.abs(mindiff - target))
					mindiff = curr_sum;
			}
			i++;
		}
		return mindiff;

	}

}
