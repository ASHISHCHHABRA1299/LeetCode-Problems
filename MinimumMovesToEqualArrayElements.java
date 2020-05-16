package leetcode;

public class MinimumMovesToEqualArrayElements {

	public static void main(String[] args) {
		int[] nums = { 4, 5, 4 };
		int sum = 0;
		int min = Integer.MAX_VALUE;
		for (int a : nums) {
			sum += a;
			min = Math.min(min, a);
		}
		System.out.println(sum - nums.length * min);
	}

}
