package leetcode;

public class ElementAppearingMoreThan4timesInSortedArray {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 2, 6, 6, 6, 6, 7, 10 };
		int quarter = nums.length / 4;
		for (int i = 0; i <= nums.length - quarter; i++) {
			if (nums[i] == nums[i + quarter]) {
				System.out.println(nums[i]);
				return;
			}
		}
		System.out.println(-1);
	}

}
