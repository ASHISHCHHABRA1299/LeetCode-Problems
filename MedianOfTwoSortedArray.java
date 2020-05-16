package leetcode;

public class MedianOfTwoSortedArray {

	public static void main(String[] args) {
		int[] nums1 = { 1, 2 };
		int[] nums2 = { 3, 4 };
		System.out.println(findmedian(nums1, nums2));
	}

	private static double findmedian(int[] nums1, int[] nums2) {

		int x = nums1.length;
		int y = nums2.length;
		if (x > y) {
			int[] temp = nums1;
			nums1 = nums2;
			nums2 = temp;
			int tmp = x;
			x = y;
			y = tmp;
		}
		int low = 0;
		int high = x;
		while (low <= high) {
			int partitionx = (low + high) / 2;
			int partitiony = (x + y + 1) / 2 - partitionx;

			int maxleftx = (partitionx == 0) ? Integer.MIN_VALUE : nums1[partitionx - 1];
			int minrightx = (partitionx == x) ? Integer.MAX_VALUE : nums1[partitionx];
			int maxlefty = (partitiony == 0) ? Integer.MIN_VALUE : nums2[partitiony - 1];
			int minrighty = (partitiony == y) ? Integer.MAX_VALUE : nums2[partitiony];

			if (maxleftx <= minrighty && maxlefty <= minrightx) {
				if ((x + y) % 2 == 1) {
					return (double) Math.max(maxlefty, maxleftx);
				} else {
					return ((double) Math.max(maxleftx, maxlefty) + Math.min(minrightx, minrighty)) / 2;
				}
			} else if (maxleftx > minrighty) {
				high = partitionx - 1;
			} else {
				low = partitionx + 1;
			}
		}
		return 0.0;
	}

}
