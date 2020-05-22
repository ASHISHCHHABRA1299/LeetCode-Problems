package leetcode;

public class MinimumSizeSubarraySum {

	public static void main(String[] args) {
		int[] nums = { 2, 3, 1, 2, 4, 0 };
		int s = 7;
		int sum = 0;
		int left = 0;
//		int right = 0;
		int minlength = Integer.MAX_VALUE;
//		while (right < nums.length) {
//			if (sum < s) {
//				sum += nums[right++];
//			} else {
//				minlength = Math.min(right - left, minlength);
//				sum -= nums[left++];
//			}
//		}
//		while (left < nums.length) {
//			if (sum >= s) {
//				sum -= nums[left];
//				minlength = Math.min(right - left, minlength);
//			}
//			left++;
//		}
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
			while (sum >= s) {
				minlength = Math.min(minlength, i - left + 1);
				sum -= nums[left++];
			}
		}
		minlength = minlength == Integer.MAX_VALUE ? 0 : minlength;
		System.out.println(minlength);

	}

}
