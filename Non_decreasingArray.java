package leetcode;

public class Non_decreasingArray {

	public static void main(String[] args) {
		int[] nums = { 4, 2, 1 };
		int count = 0;
		for (int i = 1; i < nums.length; i++) {
			if (nums[i - 1] > nums[i]) {
				count++;
				if (i == 1 || nums[i - 2] <= nums[i])
					nums[i - 1] = nums[i];
				else
					nums[i] = nums[i - 1];
			}
		}
		if (count <= 1)
			System.out.println(true);
		else
			System.out.println(false);

	}

}
