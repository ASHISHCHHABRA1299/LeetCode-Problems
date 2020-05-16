package leetcode;

public class FindFirstAndLastPositionOfElementInSortedArray {

	public static void main(String[] args) {
		int[] nums = { 5, 7, 7, 8, 8, 10 };
		int s = 0;
		int e = nums.length - 1;
		int target = 8;
		int[] arr = new int[2];
		int ans1 = lowerbound(nums, s, e, target);
		int ans2 = upperbound(nums, s, e, target);
		arr[0] = ans1;
		arr[1] = ans2;
		for (int val : arr)
			System.out.print(val + " ");
	}

	public static int lowerbound(int[] arr, int s, int e, int key) {
		int ans = -1;
		while (s <= e) {
			int mid = (s + e) / 2;
			if (arr[mid] == key) {
				ans = mid;
				e = mid - 1;
			} else if (arr[mid] > key) {
				e = mid - 1;
			} else {
				s = mid + 1;
			}
		}
		return ans;
	}

	public static int upperbound(int[] arr, int s, int e, int key) {
		int ans = -1;
		while (s <= e) {
			int mid = (s + e) / 2;
			if (arr[mid] == key) {
				ans = mid;
				s = mid + 1;
			} else if (arr[mid] > key) {
				e = mid - 1;
			} else {
				s = mid + 1;
			}
		}
		return ans;
	}

}
