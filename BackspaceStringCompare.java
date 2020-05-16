package leetcode;

public class BackspaceStringCompare {

	public static void main(String[] args) {
		String S = "a#c";
		String T = "b";
		String s2 = "";
		String s3 = "";
		int counthash1 = 0;
		int counthash2 = 0;
		int i = S.length() - 1;
		int j = T.length() - 1;
		while (i >= 0) {
			if (counthash1 == 0 && S.charAt(i) != '#') {
				s2 = S.charAt(i) + s2;
			}
			if (counthash1 != 0 && S.charAt(i) != '#') {
				counthash1--;
			}
			if (S.charAt(i) == '#')
				counthash1++;
			i--;
		}
		while (j >= 0) {
			if (counthash2 == 0 && T.charAt(j) != '#') {
				s3 = T.charAt(j) + s3;
			}
			if (counthash2 != 0 && T.charAt(j) != '#') {
				counthash2--;
			}
			if (T.charAt(j) == '#')
				counthash2++;
			j--;
		}
		if (s2.equals(s3))
			System.out.println(true);
		else
			System.out.println(false);
	}

}
