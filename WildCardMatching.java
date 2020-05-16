package leetcode;

public class WildCardMatching {

	public static void main(String[] args) {

		String s = "cb";
		String p = "?a";
		System.out.println(wildcard(s, p));
		System.out.println(wildcardTD(s, p, new int[s.length() + 1][p.length() + 1]));
		System.out.println(wildcardBU(s, p));
	}

	private static boolean wildcard(String s, String p) {

		if (s.length() == 0 && p.length() == 0)
			return true;
		if (s.length() == 0 && p.length() != 0) {
			for (int i = 0; i < p.length(); i++) {
				if (p.charAt(i) != '*')
					return false;
			}
			return true;
		}
		if (s.length() != 0 && p.length() == 0)
			return false;
		char ch1 = s.charAt(0);
		char ch2 = p.charAt(0);
		String ros1 = s.substring(1);
		String ros2 = p.substring(1);
		boolean res = false;
		if (ch1 == ch2 || ch2 == '?')
			res = wildcard(ros1, ros2);
		else if (ch2 == '*') {
			boolean first = wildcard(s, ros2);
			boolean second = wildcard(ros1, p);
			res = first || second;
		} else {
			res = false;
		}
		return res;

	}

	private static boolean wildcardTD(String s, String p, int[][] strg) {

		if (s.length() == 0 && p.length() == 0)
			return true;
		if (s.length() == 0 && p.length() != 0) {
			for (int i = 0; i < p.length(); i++) {
				if (p.charAt(i) != '*')
					return false;
			}
			return true;
		}
		if (s.length() != 0 && p.length() == 0)
			return false;
		if (strg[s.length()][p.length()] != 0)
			return strg[s.length()][p.length()] == 2 ? true : false;
		char ch1 = s.charAt(0);
		char ch2 = p.charAt(0);
		String ros1 = s.substring(1);
		String ros2 = p.substring(1);
		boolean res = false;
		if (ch1 == ch2 || ch2 == '?')
			res = wildcardTD(ros1, ros2, strg);
		else if (ch2 == '*') {
			boolean first = wildcardTD(s, ros2, strg);
			boolean second = wildcardTD(ros1, p, strg);
			res = first || second;
		} else {
			res = false;
		}
		if (res)
			strg[s.length()][p.length()] = 2;
		else
			strg[s.length()][p.length()] = 1;
		return res;

	}

	private static boolean wildcardBU(String s, String p) {
		boolean[][] strg = new boolean[s.length() + 1][p.length() + 1];
		for (int i = 0; i < strg.length; i++)
			strg[i][p.length()] = false;
		strg[s.length()][p.length()] = true;
		for (int i = p.length() - 1; i >= 0; i--) {
			if (p.charAt(i) == '*') {
				strg[s.length()][i] = strg[s.length()][i + 1];
			} else {
				strg[s.length()][i] = false;
			}
		}
		
		for (int row = s.length() - 1; row >= 0; row--) {
			for (int col = p.length() - 1; col >= 0; col--) {
				char ch1 = s.charAt(row);
				char ch2 = p.charAt(col);
				boolean res;
				if (ch1 == ch2 || ch2 == '?')
					res = strg[row + 1][col + 1];
				else if (ch2 == '*') {
					boolean second = strg[row][col + 1];
					boolean first = strg[row + 1][col];
					res = first || second;
				} else {
					res = false;
				}
				strg[row][col] = res;
			}
		}
//		for (int i = 0; i < strg.length; i++) {
//			for (int j = 0; j < strg[i].length; j++) {
//				System.out.print(strg[i][j] + " ");
//			}
//			System.out.println();
//		}
		return strg[0][0];
	}
}
