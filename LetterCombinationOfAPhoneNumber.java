package leetcode;

import java.util.ArrayList;
import java.util.Scanner;

public class LetterCombinationOfAPhoneNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String scn=s.next();
		System.out.println(keypad(scn));

	}

	public static ArrayList<String> keypad(String s) {
		if (s.length() == 0) {
			ArrayList<String> br = new ArrayList<String>();
			br.add("");
			return br;
		}
		char ch = s.charAt(0);
		String ros = s.substring(1);
		ArrayList<String> rr = keypad(ros);
		ArrayList<String> mr = new ArrayList<String>();
		String code = getcode(ch + "");
		for(int i=0;i<code.length();i++)
        {
        	for(String val:rr)
        		 mr.add(code.charAt(i)+val);
        }
		return mr;
	}

	public static String getcode(String s) {
		if (s.equals("2"))
			return "abc";
		else if (s.equals("3"))
			return "def";
		else if (s.equals("4"))
			return "ghi";
		else if (s.equals("5"))
			return "jkl";
		else if (s.equals("6"))
			return "mno";
		else if (s.equals("7"))
			return "pqrs";
		else if (s.equals("8"))
			return "tuv";
		else if (s.equals("9"))
			return "wxyz";
		else
			return "";
	}

}
