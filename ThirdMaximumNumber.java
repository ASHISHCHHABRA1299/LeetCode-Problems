package leetcode;

public class ThirdMaximumNumber {

	public static void main(String[] args) {
		int[] nums = { 2, 3, 2, 1 };
		Integer max = null;
		Integer smax = null;
		Integer tmax = null;
		for (Integer num : nums) {
			if (num.equals(max) || num.equals(smax) || num.equals(tmax))
				continue;
			if (max == null || num > max) {
				tmax = smax;
				smax = max;
				max = num;
			} else if (smax == null || num > smax) {
				tmax = smax;
				smax = num;
			} else if (tmax == null || num > tmax) {
				tmax = num;
			}
		}
		if (tmax == null)
			System.out.println(max);
		else
			System.out.println(tmax);
	}

}
