package leetcode;

import java.util.HashMap;
import java.util.HashSet;

public class CointainsDuplicate {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4 };
		HashSet<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < nums.length; i++) {
			if (set.contains(nums[i])) {
				System.out.println(true);
				return;
			}
			set.add(nums[i]);

		}
		System.out.println(false);
	}

}
