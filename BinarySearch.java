package leetcode;

public class BinarySearch {

	public static void main(String[] args) {
		int[] nums = { -1, 0, 3, 5, 9, 12 };
		int target = 2;
		int lo = 0;
		int hi = nums.length - 1;
		while (lo <= hi) {
			int mid = lo + ((hi - lo) >> 1);
			if (target > nums[mid]) {
				lo = mid + 1;
			} else if (target < nums[mid]) {
				hi = mid - 1;
			} else {
				System.out.println(mid);
				return;
			}
		}

		System.out.println(-1);

	}

}
