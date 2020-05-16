package leetcode;

public class SingleNumber {

	public static void main(String[] args) {
		int[] nums = { 2, 2, 1 };
		int res = nums[0];
		for (int i = 1; i < nums.length; i++)
			res = res ^ nums[i];
		System.out.println(res);
	}
}
