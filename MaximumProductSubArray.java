package leetcode;

public class MaximumProductSubArray {

	public static void main(String[] args) {
		int[] nums = { -2, 0, -1 };
		int maxproduct = 0;
		if (nums.length == 1) {
			System.out.println(nums[0]);
			return;
		}
		for (int i = 0; i < nums.length; i++) {
			int product = 1;
			for (int j = i; j < nums.length; j++) {
				product *= nums[j];
				if (product > maxproduct)
					maxproduct = product;
			}
		}
		System.out.println(maxproduct);
	}

}
