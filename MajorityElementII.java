package leetcode;

import java.util.ArrayList;
import java.util.List;

public class MajorityElementII {

	public static void main(String[] args) {
		int[] nums = { 1, 1, 1, 3, 3, 2, 2, 2 };
//		int[] nums = { 3, 2, 3 };
		int count1 = 1, candidate1 = nums[0];
		int count2 = 0, candidate2 = 0;
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 1; i < nums.length; i++) {
			int num = nums[i];
			if (candidate1 == num) {
				count1++;
			} else if (candidate2 == num) {
				count2++;
			} else if (count1 == 0) {
				candidate1 = num;
				count1 = 1;
			} else if (count2 == 0) {
				candidate2 = num;
				count2 = 1;
			} else {
				count1--;
				count2--;
			}
		}
		count1 = 0;
		count2 = 0;
		for (int num : nums) {
			if (num == candidate1) {
				count1++;
			} else if (num == candidate2) {
				count2++;
			}
		}
		if (count1 > nums.length / 3)
			list.add(candidate1);
		if (count2 > nums.length / 3)
			list.add(candidate2);
		System.out.println(list);
	}
}
