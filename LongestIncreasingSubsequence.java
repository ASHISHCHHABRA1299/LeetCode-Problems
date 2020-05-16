package leetcode;

public class LongestIncreasingSubsequence {

	public static void main(String[] args) {
		int[] nums = { 10, 9, 2, 5, 3, 7, 101, 18 };
//		System.out.println(lis(nums, Integer.MIN_VALUE, 0));
		int[] lis = new int[nums.length];
		lis[0] = 1;

		for (int i = 1; i < lis.length; i++) {
			int j = i - 1;
			int max1 = 1;
			while (j >= 0) {
				if (nums[j] < nums[i]) {
					if (lis[j] + 1 > max1)
						max1 = lis[j] + 1;
				}
				j--;
			}
			lis[i] = max1;

		}
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < lis.length; i++) {
			if (lis[i] > max)
				max = lis[i];
		}
		System.out.println(max);
//	   	int maxcount = 0;
//		for (int i = 0; i < nums.length - 1; i++) {
//			int count = 1;
//			int max = nums[i];
//			for (int j = i; j < nums.length - 1; j++) {
//				if (nums[j + 1] > max) {
//					count++;
//					max = nums[j + 1];
//				}
//			}
//			if (count > maxcount)
//				maxcount = count;
//		}
//		for (int i = nums.length-1; i > 0; i--) {
//			int count = 1;
//			int max = nums[i];
//			for (int j = i; j > 0; j--) {
//				if (nums[j - 1] < nums[j]) {
//					count++;
//					max = nums[j - 1];
//				}
//			}
//			if (count > maxcount)
//				maxcount = count;
//		}
//		System.out.println(maxcount);

	}

	public static int lis(int[] nums, int prev, int curr) {
		if (curr == nums.length)
			return 0;

		int taken = 0;
		if (nums[curr] > prev)
			taken = 1 + lis(nums, nums[curr], curr + 1);
		int nottaken = lis(nums, prev, curr + 1);

		return Math.max(taken, nottaken);
	}

}
