package leetcode;

import java.util.Arrays;

public class AssignCookies {

	public static void main(String[] args) {
		int[] g = { 1, 2, 3 };
		int[] s = { 1, 1 };
		Arrays.sort(g);
		Arrays.sort(s);
		int j = s.length - 1;
		int i = g.length - 1;
		int count = 0;
		while (i >= 0 && j >= 0) {
			if (s[j] >= g[i]) {
				count++;
				j--;
				i--;
			} else
				i--;
		}
		System.out.println(count);
	}

}
