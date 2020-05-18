package leetcode;

public class MaximumAverageSubarrayI {

	public static void main(String[] args) {
		int[] nums = {0,1,1,3,3};
		int k = 4;
//		double avg = Integer.MIN_VALUE, sum = 0;
//		for (int i = 0; i < nums.length; i++) {
//			if (i >= k) {
//				avg = Math.max(avg, sum / k);
//				sum = sum - nums[i - k];
//			}
//			sum += nums[i];
//		}
//		System.out.println(avg);

		double avg = 0, sum = 0;
		int left = 0, right = 0;
		while (right < nums.length) {
			sum += nums[right];
			if (right - left == k - 1) {
				avg = Math.max(avg, sum / k);
				sum -= nums[left++];
			}
			right++;
		}
		System.out.println(avg);
	}

}
