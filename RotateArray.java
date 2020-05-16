package leetcode;

public class RotateArray {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
		int k = 3;
//		while (k-- > 0) {
//			int temp = nums[nums.length - 1];
//			for (int i = nums.length - 2; i >= 0; i--) {
//				nums[i + 1] = nums[i];
//			}
//			nums[0] = temp;
//		}
		reverse(nums, 0, nums.length - 1);
		reverse(nums, 0, k - 1);
		reverse(nums, k, nums.length - 1);
		for (int val : nums)
			System.out.print(val + " ");
	}

	public static void reverse(int[] nums, int start, int end) {
		while (start < end) {
			int temp = nums[start];
			nums[start] = nums[end];
			nums[end] = temp;
			start++;
			end--;
		}
	}

}
