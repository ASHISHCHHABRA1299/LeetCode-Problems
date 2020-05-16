package leetcode;

public class MoveZeroes {

	public static void main(String[] args) {
		int[] nums = { 5, 1, 0, 0, 12 };
		int i = 0, j = 0;
		while (j < nums.length) {
			if (nums[i] == 0 && nums[j] != 0) {
				nums[i++] = nums[j];
				nums[j] = 0;
			} else if (nums[i] != 0 && nums[j] != 0) {
				i++;
				j++;
			} else {
				j++;
			}
		}
		for (int val : nums)
			System.out.print(val + " ");
	}

}

/*
 * index variable start from 0 and put the non zero values to the index and then
 * start a loop from the index to the nums.length then put 0 to all the indexes
 * which maintain the alignment of the non zero elements
 */
