package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllAnagramsInAString {

	public static void main(String[] args) {
		String s = "abab";
		String p = "ab";
		List<Integer> l = new ArrayList<>();
//		int n = s.length();
//		int m = p.length();
//		for (int i = 0; i <= n - m; i++) {
//			if (equal(s.substring(i, i + m), p))
//				l.add(i);
//		}
//		System.out.println(l);

		int[] pf = new int[26];
		for (int i = 0; i < p.length(); i++)
			pf[p.charAt(i) - 97]++;
		for (int i = 0; i <= s.length()-p.length(); i++) {
			int[] temp = pf.clone();
			String sub = s.substring(i, i + p.length());
			int flag = 0;
			for (int j = 0; j < sub.length(); j++) {
				temp[sub.charAt(j) - 97]--;
			}
			for (int j = 0; j < temp.length; j++) {
				if (temp[j] != 0) {
					flag = 1;
					break;
				}
			}
			if (flag == 0)
				l.add(i);
		}
		System.out.println(l);

	}

//	private static boolean equal(String s, String p) {
//		char[] cs = s.toCharArray();
//		char[] cp = p.toCharArray();
//		Arrays.sort(cp);
//		Arrays.sort(cs);
//		return new String(cp).equals(new String(cs));
//	}

}
