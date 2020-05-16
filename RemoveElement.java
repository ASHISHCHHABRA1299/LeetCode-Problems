package leetcode;

public class RemoveElement {

	public static void main(String[] args) {
		int[] nums = { 3, 2, 2, 3 };
//		int[] nums = { 0, 1, 2, 2, 3, 0, 4, 2 };
		int val = 3;
//		int j = nums.length - 1;
//		int i = 0;
//		int total = 0;
//		for (int n : nums) {
//			if (n == val)
//				total++;
//		}
//		while (i < j) {
//			if (nums[j] == val) {
//				j--;
//				continue;
//			}
//			if (nums[i] == val) {
//				int temp = nums[i];
//				nums[i] = nums[j];
//				nums[j] = temp;
//				j--;
//			}
//			i++;
//		}
		
		int index = 0;
		for (int i : nums) {
			if (i != val) {
				nums[index++] = i;
			}
		}
		System.out.println(index);
		for (int num : nums)
			System.out.print(num + " ");

	}

}
