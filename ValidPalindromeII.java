package leetcode;

public class ValidPalindromeII {

	public static void main(String[] args) {
		String s = "abca";
		int left = 0;
		int right = s.length() - 1;
		while (left < right) {
			if (s.charAt(left) != s.charAt(right)) {
				System.out.println(ispalindrome(s, left + 1, right) || ispalindrome(s, left, right - 1));
				return;
			}
			left++;
			right--;
		}
		System.out.println(true);
	}

	private static boolean ispalindrome(String s, int i, int j) {
		while (i < j) {
			if (s.charAt(i++) != s.charAt(j--))
				return false;
		}
		return true;
	}

}
