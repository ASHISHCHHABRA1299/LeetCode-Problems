package leetcode;

import java.util.ArrayList;
import java.util.HashMap;

public class ThreeSum_2 {

	public static void main(String[] args) {

		int[] nums = { -1, 0, 1, 2, -1, -4 };
//		int[] nums = { 0, 0, 0, 0 };
//		int[] nums = { -2, 0, 0, 2, 2 };
		ArrayList<Integer> l = new ArrayList<Integer>();
		ArrayList<ArrayList<Integer>> l1 = new ArrayList<ArrayList<Integer>>();
		HashMap<Integer, Boolean> seen = new HashMap<Integer, Boolean>();
		int i = 0;
		while (i <= nums.length - 3) {
			if (seen.containsKey(nums[i])) {
				i++;
				continue;
			}
			seen.put(nums[i], true);
			int x = -nums[i];
			int j = i + 1;
			while (j < nums.length) {
				int y = x - nums[j];
				if (seen.containsKey(y)) {
					l.add(nums[i]);
					l.add(nums[j]);
					l.add(y);
					l1.add(l);
					l = new ArrayList<Integer>();
				}

				seen.put(nums[j], true);
				j++;
			}
		}
		System.out.println(l1);
	}

}
