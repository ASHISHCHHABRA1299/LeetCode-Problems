package leetcode;

public class RemoveDuplicatesFromSortedArray {

	public static void main(String[] args) {
		// o(1) memory space
		// same array
		int[] nums = { 1, 1, 2 };
		int count = 1;
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] != nums[i + 1]) {
				nums[count] = nums[i + 1];
				count++;
			}
		}
		System.out.println(count);
		for (int val : nums)
			System.out.print(val + " ");
	}

}
