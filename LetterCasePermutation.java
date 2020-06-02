package leetcode;

import java.util.ArrayList;
import java.util.List;

public class LetterCasePermutation {

	public static void main(String[] args) {
		List<String> l = new ArrayList<String>();
		letter("12345", "", l);
		System.out.println(l);
	}

	private static void letter(String ques, String ans, List<String> l) {
		if (ques.length() == 0) {
			l.add(ans);
			return;
		}
		char c = ques.charAt(0);
		String ros = ques.substring(1);
		if (c >= 'a' && c <= 'z') {
			letter(ros, ans + c, l);
			letter(ros, ans + (char) (c - 32), l);
		} else if (c >= 'A' && c <= 'Z') {
			letter(ros, ans + c, l);
			letter(ros, ans + (char) (c + 32), l);
		} else {
			letter(ros, ans + c, l);
		}
	}

}
