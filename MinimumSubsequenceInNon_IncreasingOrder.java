package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumSubsequenceInNon_IncreasingOrder {

	public static void main(String[] args) {
		int[] nums = { 4, 4, 7, 6, 7 };
		int sum = 0;
		for (int num : nums)
			sum += num;
		Arrays.sort(nums);
		List<Integer> res = new ArrayList<Integer>();
		int finalsum = 0;
		for (int i = nums.length - 1; i >= 0; i--) {
			if (finalsum > sum - finalsum)
				break;
			res.add(nums[i]);
			finalsum += nums[i];
		}
		System.out.println(res);
	}

}
