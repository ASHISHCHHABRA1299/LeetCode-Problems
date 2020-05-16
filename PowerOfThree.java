package leetcode;

public class PowerOfThree {

	public static void main(String[] args) {
		int n = 45;
//		if (n == 0) {
//			System.out.println(false);
//			return;
//		}
//		while (n % 3 == 0) {
//			n = n / 3;
//		}
//		if (n != 1)
//			System.out.println(false);
//		else
//			System.out.println(true);
		int m = (int) (Math.log10(n) / Math.log10(3));
		if (m % 1 == 0)
			System.out.println(true);
		else
			System.out.println(false);

	}

//	private static boolean isPowerOfThree(int n) {
//		if (n == 0)
//			return false;
//		boolean ans = false;
//		if (n % 3 != 0)
//			return false;
//		ans = ans || isPowerOfThree(n / 3);
//		if (n == 1 && n % 3 != 0) {
//			ans = true;
//		}
//		return ans;
//
//	}
}
