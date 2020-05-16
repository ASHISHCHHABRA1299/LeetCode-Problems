package leetcode;

public class ContainerWithMostWater {

	public static void main(String[] args) {
		// first way is to do brute force with i and j and calculate maxans between each
		// pair
		int[] height = { 2, 3, 4, 5, 18, 17, 6 };
		int l = 0, r = height.length - 1;
		int maxans = 0;
		while (l < r) {
			maxans = Math.max(maxans, (r - l) * Math.min(height[l], height[r]));
			if (height[l] < height[r])
				l++;
			else
				r--;
		}
		System.out.println(maxans);
	}
}
