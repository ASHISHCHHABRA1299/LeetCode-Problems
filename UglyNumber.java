package leetcode;

public class UglyNumber {

	public static void main(String[] args) {

		int n = 14;
//		System.out.println(ugly(n));
		if (n == 0) {
			System.out.println(false);
			return;
		}
		while (n % 2 == 0)
			n = n / 2;
		while (n % 3 == 0)
			n = n / 3;
		while (n % 5 == 0)
			n = n / 5;
		if (n == 1)
			System.out.println(true);
		else
			System.out.println(false);
	}

	private static boolean ugly(int n) {
		if (n == 1)
			return true;
		boolean ans = false;
		if (n % 2 == 0) {
			ans = ans || ugly(n / 2);
		}
		if (n % 3 == 0) {
			ans = ans || ugly(n / 3);
		}
		if (n % 5 == 0) {
			ans = ans || ugly(n / 5);
		}
		return ans;
	}

}
