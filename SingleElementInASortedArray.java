package leetcode;

public class SingleElementInASortedArray {

	public static void main(String[] args) {
		int[] nums = { 1, 1, 2, 3, 3, 4, 4, 8, 8 };
		int lo = 0;
		int hi = nums.length - 1;
		int flag = 0;
		while (lo < hi) {
			int mid = lo + (hi - lo) / 2;

			if (nums[mid] == nums[mid - 1]) {
				if ((hi - mid) % 2 == 0) {
					hi = mid - 2;
				} else {
					lo = mid + 1;
				}
			} else if (nums[mid] == nums[mid + 1]) {
				if ((hi - mid) % 2 == 0) {
					lo = mid + 2;
				} else {
					hi = mid - 1;
				}
			} else {
				System.out.println(nums[mid]);
				flag = 1;
				break;
			}
		}
		if (flag == 0)
			System.out.println(nums[lo]);
	}

}
