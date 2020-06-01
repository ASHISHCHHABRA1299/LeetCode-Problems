package leetcode;

public class MinimumValueToGetPositiveStepByStepSum {

	public static void main(String[] args) {
		int[] nums = { 2, 3, 5, -5, -1 };
		int[] prefixsum = new int[nums.length];
		prefixsum[0] = nums[0];
		int min = nums[0];
		for (int i = 1; i < nums.length; i++) {
			prefixsum[i] = prefixsum[i - 1] + nums[i];
			min = Math.min(min, prefixsum[i]);
		}
		if (min > 0)
			System.out.println(min);
		else
			System.out.println(1 + (-1 * min));

	}

}
