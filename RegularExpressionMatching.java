package leetcode;

public class RegularExpressionMatching {

	public static void main(String[] args) {
		String s = "aab";
		String p = "a*b";
		System.out.println(regular(s, p));
	}

	private static boolean regular(String s, String p) {

		if (s.length() == 0 && p.length() == 0)
			return true;
		if (s.length() != 0 && p.length() == 0)
			return false;
//		if (s.length() == 0 && p.length() != 0)
//			return false;
		char sch = s.charAt(0);
		char pch = p.charAt(0);
		String ros1 = s.substring(1);
		String ros2 = p.substring(1);
		boolean res = true;
		if (sch == pch || pch == '.') {
			res = regular(ros1, ros2);
		} else if (ros2.length()>=2&&pch == '*') {
			boolean left = regular(s, ros2.substring(1));
			boolean right = regular(ros1, p);
			res = left && right;
		} else
			res = false;
		return res;
	}

}
