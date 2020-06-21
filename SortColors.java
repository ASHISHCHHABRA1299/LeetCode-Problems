package leetcode;

public class SortColors {

	public static void main(String[] args) {
		int[] nums = { 2, 0, 2, 1, 1, 0 };
		int count0 = 0;
		int count2 = 0;
		for (int num : nums) {
			if (num == 0)
				count0++;
			if (num == 2)
				count2++;
		}

		for (int i = 0; i < count0; i++)
			nums[i] = 0;
		for (int i = nums.length - 1; i >= nums.length - count2; i--)
			nums[i] = 2;
		for (int i = count0; i < nums.length - count2; i++)
			nums[i] = 1;
		for (int val : nums)
			System.out.print(val + " ");


	}

}
