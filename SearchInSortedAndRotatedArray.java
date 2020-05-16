package leetcode;

public class SearchInSortedAndRotatedArray {

	public static void main(String[] args) {
		int[] nums = { 4, 5, 6, 7, 0, 1, 2 };
		int target = 7;
		int s = 0;
		int e = nums.length - 1;
		System.out.println(search(nums, s, e, target));

	}

	public static int search(int[] arr, int s, int e, int key) {
//		Base case
		if (s > e)
			return -1;
		int mid = (s + e) / 2;
		if (arr[mid] == key)
			return mid;
		//left part
		if (arr[s] <= arr[mid]) {
			if (key >= arr[s] && key <= arr[mid])
				return search(arr, s, mid - 1, key);
			else
				return search(arr, mid + 1, e, key);
		}
		//right part	
		if (key >= arr[mid] && key <= arr[e])
			return search(arr, mid + 1, e, key);
		return search(arr, s, mid - 1, key);
	}
}
 