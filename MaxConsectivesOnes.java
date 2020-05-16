package leetcode;

public class MaxConsectivesOnes {

	public static void main(String[] args) {
		int[] nums = { 1, 1, 0, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1 };
		int count = 0;
		int maxcount = Integer.MIN_VALUE;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 0)
				count = 0;
			if (nums[i] == 1) {
				count++;
			}
			if (count > maxcount)
				maxcount = count;

		}
		System.out.println(maxcount);

	}

}
