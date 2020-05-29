package leetcode;

public class FindPivotIndex {

	public static void main(String[] args) {
		int[] nums = { 1,2,3 };
		int totalsum = 0;
		for (int num : nums)
			totalsum += num;
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			totalsum -= nums[i];
			if (totalsum == sum) {
				System.out.println(i);
				return;
			}
			sum += nums[i];
			System.out.println(totalsum + " " + sum);
		}
		System.out.println(-1);

	}
	// total sum=27 20 17 11
	// sum=1 8 11

}
