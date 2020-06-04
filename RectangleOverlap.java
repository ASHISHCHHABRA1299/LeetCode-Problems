package leetcode;

public class RectangleOverlap {

	public static void main(String[] args) {
		int[] rect1 = { 0, 0, 1, 1 };
		int[] rect2 = { 1, 0, 2, 1 };
		boolean ans = (rect1[2] <= rect2[0] || rect1[3] <= rect2[1] || rect1[0] >= rect2[2] || rect1[1] >= rect2[3]);
		System.out.println(!ans);

	}

}
