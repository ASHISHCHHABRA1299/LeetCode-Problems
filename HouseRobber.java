package leetcode;

public class HouseRobber {

	public static void main(String[] args) {

		int[] nums = { 2, 7, 9, 3, 1 };
//		int[] nums = { 0 };
		int i = 0;
		int maxsum = Integer.MIN_VALUE;
		while (i < nums.length / 2) {
			int j = i + 2;

			int sum = nums[i];
			while (j < nums.length) {
				sum += nums[j];
				j = j + 2;
			}

			if (sum > maxsum)
				maxsum = sum;
			i = i + 1;
		}
		System.out.println(maxsum);

	}

}
