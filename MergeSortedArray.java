package leetcode;

public class MergeSortedArray {

	public static void main(String[] args) {
		int[] nums1 = { 4, 5, 6, 0, 0, 0 }; // m=3 size=6
		int[] nums2 = { 1, 2, 3 }; // n=3 size=3
		int m = 3;
		int n = 3;
		int first = m - 1;
		int second = n - 1;
		for (int i = m + n - 1; i >= 0; i--) {
			if (second < 0)
				break;
			if (first < 0 && second != -1) {
				nums1[i] = nums2[second];
				second--;
				continue;
			}
			if (nums1[first] > nums2[second]) {
				nums1[i] = nums1[first];
				first--;
			} else {
				nums1[i] = nums2[second];
				second--;
			}
		}
		for (int val : nums1)
			System.out.println(val);
	}
}
