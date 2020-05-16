package leetcode;

import java.util.Arrays;

public class ShortestUnsortedContinuousSubarray {

	public static void main(String[] args) {
		int[] nums = { 2, 6, 4, 8, 10, 9, 15 };
		int[] newnums = nums.clone();
		Arrays.sort(newnums);
		int start = newnums.length;
		int end = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != newnums[i]) {
				start = Math.min(start, i);
				end = Math.max(end, i);
			}
		}
		if (end - start >= 0)
			System.out.println(end - start + 1);
		else
			System.out.println(0);
	}

}
