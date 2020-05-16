package leetcode;

public class SearchInsertPosition {

	public static void main(String[] args) {
		int[] nums = { 1, 3, 5, 6 };
		int target = 5;
		if (target < nums[0]) {
			System.out.println(0);
			return;
		}
		if (target > nums[nums.length - 1]) {
			System.out.println(nums.length);
			return;
		}

		int index = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] >= target)
				break;
			index++;
		}
		System.out.println(index);

	}

}
