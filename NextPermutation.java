package leetcode;

import java.util.Arrays;

public class NextPermutation {

	public static void main(String[] args) {

		int[] nums = { 1, 2, 3 };
		int n = nums.length;
		int i;
		for (i = n - 1; i > 0; i--) {
			if (nums[i] > nums[i - 1])
				break;
		}
		if (i == 0)
			Arrays.sort(nums);
		else {
			int m = nums[i - 1];
			int min = i;
			for (int j = i + 1; j < n; j++) {
				if (nums[j] < nums[min] && nums[j] > m)
					min = j;
			}
			swap(nums, i - 1, min);
			Arrays.sort(nums, i, n);
		}
		for (int num : nums)
			System.out.print(num + " ");
	}

	public static void swap(int[] nums, int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}

}
