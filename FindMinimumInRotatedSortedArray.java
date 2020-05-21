package leetcode;

public class FindMinimumInRotatedSortedArray {

	public static void main(String[] args) {
		int[] nums = { 3, 4, 5, 1, 2 };
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i + 1] < nums[i]) {
				System.out.println(nums[i + 1]);
				return;
			}
		}
		System.out.println(nums[0]);

	}

}
