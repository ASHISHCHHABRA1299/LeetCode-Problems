package leetcode;

public class MaximumSubarraySumNegative {

	public static void main(String[] args) {
		int[] nums = { -1, -2 };
//		if (nums.length == 1)
//			System.out.println(nums[0]);
		int ms = Integer.MIN_VALUE;
		int cs = 0;
		int maxnegative = Integer.MIN_VALUE;
		for (int i = 0; i < nums.length; i++) {
			cs += nums[i];
			if (cs > maxnegative) {
				maxnegative = cs;
			}
			if (cs < 0) {
				cs = 0;
			}
			ms = Math.max(ms, cs);
		}
		if (ms == 0)
			ms = maxnegative;

		System.out.println(ms);

	}

}
