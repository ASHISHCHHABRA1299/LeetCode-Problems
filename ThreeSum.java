package leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class ThreeSum {

	public static void main(String[] args) {
		int[] nums = { -1, 0, 1, 2, -1, -4 };
//		int[] nums = { 0, 0, 0, 0 };
//		int[] nums = { -2, 0, 0, 2, 2 };
		Arrays.sort(nums);
		ArrayList<Integer> l = new ArrayList<Integer>();
		ArrayList<ArrayList<Integer>> l1 = new ArrayList<ArrayList<Integer>>();
		int i = 0;
		while (i <= nums.length - 3) {
			if (i > 0 && nums[i] == nums[i - 1]) {
				i++;
				continue;
			}
			int j = i + 1;
			int k = nums.length - 1;
			while (j < k) {
				if (j > i + 1 && nums[j] == nums[j - 1]) {
					j++;
					continue;
				}
				if (k < nums.length - 1 && nums[k] == nums[k + 1]) {
					k--;
					continue;
				}
				if (nums[i] + nums[j] + nums[k] == 0) {
					l.add(nums[i]);
					l.add(nums[j]);
					l.add(nums[k]);
					l1.add(l);
					l = new ArrayList<Integer>();
//					System.out.println(nums[i] + " " + nums[j] + " " + nums[k]);
					j++;
					k--;
				} else if (nums[i] + nums[j] + nums[k] < 0)
					j++;
				else
					k--;
			}
			i++;
		}
		System.out.println(l1);
	}
}
