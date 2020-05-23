package leetcode;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {

	public static void main(String[] args) {
		int[] nums = {0,1,2,4,5,7 };
		List<String> res = new ArrayList<String>();
		int lo = 0;
		while (lo < nums.length) {
			int hi = lo + 1;
			while (hi < nums.length && nums[hi] == nums[hi - 1] + 1) {
				hi++;
			}
			if (lo == hi-1) {
				res.add(String.valueOf(nums[lo]));
			} else {
				res.add(String.valueOf(nums[lo]) + "->" + String.valueOf(nums[hi-1]));
			}
			lo = hi;
		}
		System.out.println(res);

	}

}
