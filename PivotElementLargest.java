package leetcode;

public class PivotElementLargest {

	public static void main(String[] args) {
		// largest element in an array which is rotated and sorted
		int[] arr = { 6, 7, 8, 9, 1, 2, 3, 4, 5 };
		int s = 0;
		int e = arr.length - 1;
		while (s <= e) {
			int mid = (s + e) / 2;
			if (mid > s && arr[mid] < arr[mid - 1]) {
				System.out.println(mid - 1);
				break;
			}
			if (mid < e && arr[mid] > arr[mid + 1]) {
				System.out.println(mid);
				break;
			}
			if (arr[s] >= arr[mid])
				e = mid - 1;
			else
				s = mid + 1;
		}
		if (s > e) {
			System.out.println(-1);
		}
	}

}
