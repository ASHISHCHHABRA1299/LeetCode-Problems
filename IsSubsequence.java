package leetcode;

public class IsSubsequence {

	public static void main(String[] args) {
		String s = "aa";
		String t = "ab";
//		if(s.length()==0)
//			return true;
		int i = 0, j = 0;
		while (j < t.length()) {
			if (i < s.length() && s.charAt(i) == t.charAt(j)) {
				i++;
				j++;
			} else {
				j++;
			}

		}
		if (i == s.length())
			System.out.println(true);
		else
			System.out.println(false);
	}

}
