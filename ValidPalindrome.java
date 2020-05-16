package leetcode;

public class ValidPalindrome {

	public static void main(String[] args) {
		String s = "0P";
		String s1 = "";
		String s2 = s.toLowerCase();
		System.out.println(s2);
		for (int i = 0; i < s2.length(); i++) {
			if (Character.isDigit(s2.charAt(i)) || s2.charAt(i) >= 97 && s2.charAt(i) <= 122) {
				s1 = s2.charAt(i) + s1;
			}
		}
		boolean ans = palindome(s1);
		System.out.println(ans);
	}

	public static boolean palindome(String s1) {
		int left = 0;
		int right = s1.length() - 1;
		while (left < right) {
			if (s1.charAt(left) != s1.charAt(right))
				return false;
			left++;
			right--;
		}
		return true;
	}

	public static boolean palindrome1(String s) {
		int i = 0;
		int j = s.length() - 1;
		while (i < j) {
			while (i < j && !Character.isLetterOrDigit(s.charAt(i)))
				i++;
			while (i < j && !Character.isLetterOrDigit(s.charAt(j)))
				j--;
			if (i < j && Character.toLowerCase(s.charAt(i++)) != Character.toLowerCase(s.charAt(j--)))
				return false;
		}
		return true;
	}
}
