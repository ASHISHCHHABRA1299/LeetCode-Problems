package leetcode;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartioning {
	public static void main(String[] args) {
		String s = "cdd";
		List<String> l1 = new ArrayList<String>();
		List<List<String>> l = new ArrayList<List<String>>();
		partition(s, l, l1);
		System.out.println(l);
	}

	public static void partition(String s, List<List<String>> l, List<String> l1) {
		if (s.length() == 0) {
			l.add(new ArrayList<String>(l1));
			return;
		}
		for (int i = 1; i <= s.length(); i++) {
			String ques = s.substring(0, i);
			String ros = s.substring(i);
			if (palindrome(ques)) {
				l1.add(ques);
				partition(ros, l, l1);

				l1.remove(l1.size() - 1);
			}
		}
	}

	public static boolean palindrome(String s) {
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
