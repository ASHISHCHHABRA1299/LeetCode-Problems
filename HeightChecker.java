package leetcode;

import java.util.Arrays;

public class HeightChecker {

	public static void main(String[] args) {
		int[] heights = { 1, 1, 4, 2, 1, 3 };
		int[] h = Arrays.copyOf(heights, heights.length);
		int count = 0;
		Arrays.sort(h);
		for (int i = 0; i < heights.length; i++) {
			if (heights[i] != h[i])
				count++;
		}
		System.out.println(count);
	}

}
