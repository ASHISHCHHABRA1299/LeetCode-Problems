package leetcode;

public class HIndexII {

	public static void main(String[] args) {
		int[] nums = { 0, 1};
		int lo = 0;
		int hi = nums.length - 1;
		int ans = lo;
		while (lo < hi) {
			int mid = lo + (hi - lo + 1) / 2;
			if (nums[mid] > (nums.length - mid)) {
				{
					ans = mid;
					hi = mid-1;
				}
			} else
				lo = mid;
		}
		System.out.println(ans);
	}

}
