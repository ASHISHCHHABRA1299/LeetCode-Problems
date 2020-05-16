package leetcode;

public class JumpGame {

	public static void main(String[] args) {
//		int[] nums = { 1, 2, 0, 1 };
		int[] nums = { 2, 3, 1, 1, 2, 4, 2, 0, 1, 1 };
		int index = nums.length - 2;
		boolean path = true;
		int n = nums.length - 1;
		while (index >= 0) {
			if (nums[index] >= n - index) {
				path |= true;
				n = index;
			} else {
				path &= false;
			}
			index--;
		}
		System.out.println(path);
	}

}
