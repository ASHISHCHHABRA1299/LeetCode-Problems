package leetcode;

public class ValidPerfectSquare {

	public static void main(String[] args) {
		int num = 14;
		System.out.println(isPerfectSquare(num));
	}

	private static boolean isPerfectSquare(int num) {
		int lo = 1;
		int hi = num;
		while (lo <= hi) {
			int mid = lo + (hi - lo) / 2;
			if (mid * mid == num)
				return true;
			else if (mid * mid > num)
				hi = mid - 1;
			else
				lo = mid + 1;
		}

		return false;
	}

}
