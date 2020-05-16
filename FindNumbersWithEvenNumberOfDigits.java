package leetcode;

import lecture7.stringbuilder;

public class FindNumbersWithEvenNumberOfDigits {

	public static void main(String[] args) {
		int[] nums = { 12, 345, 2, 6, 7896 };
//		int total = 0;
//		for (int i = 0; i < nums.length; i++) {
//			int val = nums[i];
//			int count = 0;
//			while (val != 0) {
//				count++;
//				val /= 10;
//			}
//			if ((count & 1) == 0)
//				total++;
//		}
//		System.out.println(total);
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			if ((String.valueOf(nums[i]).length() % 2) == 0)
				count++;
		}
		System.out.println(count);
	}

}
