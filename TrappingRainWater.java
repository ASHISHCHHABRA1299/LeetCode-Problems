package leetcode;

public class TrappingRainWater {

	public static void main(String[] args) {
		int[] height = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
		int ans = 0;
		int[] lmax = new int[height.length];
		int[] rmax = new int[height.length];
		int lmaxval = Integer.MIN_VALUE;
		int rmaxval = Integer.MIN_VALUE;
		for (int i = 0; i < height.length; i++) {
			lmaxval = Math.max(lmaxval, height[i]);
			lmax[i] = lmaxval;
		}
		for (int i = height.length - 1; i >= 0; i--) {
			rmaxval = Math.max(rmaxval, height[i]);
			rmax[i] = rmaxval;
		}
		for (int i = 0; i < height.length; i++) {
			ans += Math.min(lmax[i], rmax[i]) - height[i];
		}
		System.out.println(ans);
	}

}
