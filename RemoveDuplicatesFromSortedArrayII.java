package leetcode;

public class RemoveDuplicatesFromSortedArrayII {

	public static void main(String[] args) {

		int[] nums = { 0, 0, 1, 1, 1, 1, 2, 3, 3 };
//		int i = 0;
//		int j = 0;
//		int count = 0;
//		int maxlimit = 0;
//		while (i < nums.length && j < nums.length) {
//			if (maxlimit < 2 && nums[i] == nums[j]) {
//				maxlimit++;
//				nums[count++] = nums[j];
//			}
//
//			if (nums[i] != nums[j]) {
//				i = j;
//				maxlimit = 0;
//				j--;
//			}
//			j++;
//		}
//		System.out.println(count);
		int left = 2;
		for (int right = 2; right < nums.length; right++) {
			if (nums[left - 2] != nums[right])
				nums[left++] = nums[right];
		}
		System.out.println(left);
	}

}
