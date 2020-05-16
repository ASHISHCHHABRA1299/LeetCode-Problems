package leetcode;

public class MisingNumber {

	public static void main(String[] args) {
		int[] nums = { 3, 0, 1 };
		int sum = (nums.length * (nums.length + 1)) / 2;
		for (int i = 0; i < nums.length; i++)
			sum -= nums[i];
		System.out.println(sum);

	}

}
