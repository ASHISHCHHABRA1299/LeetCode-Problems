package leetcode;

public class PrimePalindrome {

	public static void main(String[] args) {
		int n = 13;
		while (true) {
			if (ispalindrome(n) && isprime(n)) {
				System.out.println(n);
				return;
			}
			n++;
			if (n > 10000000 && n < 100000000)
				n = 100000000;
		}
	}

	private static boolean isprime(int n) {
		if (n < 2)
			return false;
		int R = (int) Math.sqrt(n);
		for (int d = 2; d <= R; ++d)
			if (n % d == 0)
				return false;
		return true;
	}

	private static boolean ispalindrome(int n) {
		String s = String.valueOf(n);
		int left = 0;
		int right = s.length() - 1;
		while (left < right) {
			if (s.charAt(left) != s.charAt(right))
				return false;
			left++;
			right--;
		}
		return true;
	}

}
