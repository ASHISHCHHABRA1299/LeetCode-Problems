package leetcode;

public class DecodeWays {

	public static void main(String[] args) {
		String s = "2263";
		System.out.println(decode(s));

	}

	public static int decode(String s) {
		if (s.length() == 0)
			return 1;
		if (s.charAt(0) == '0')
			return 0;
		int c = 0;
		for (int i = 1; i <= s.length(); i++) {
			String part = s.substring(0, i);
			String ros = s.substring(i);
			if (getcode(part) != "")
				c += decode(ros);
		}
		return c;
	}

	public static String getcode(String ch) {
		if (ch.equals("1"))
			return "a";
		else if (ch.equals("2"))
			return "b";
		else if (ch.equals("3"))
			return "c";
		else if (ch.equals("4"))
			return "d";
		else if (ch.equals("5"))
			return "e";
		else if (ch.equals("6"))
			return "f";
		else if (ch.equals("7"))
			return "g";
		else if (ch.equals("8"))
			return "h";
		else if (ch.equals("9"))
			return "i";
		else if (ch.equals("10"))
			return "j";
		else if (ch.equals("11"))
			return "k";
		else if (ch.equals("12"))
			return "l";
		else if (ch.equals("13"))
			return "m";
		else if (ch.equals("14"))
			return "n";
		else if (ch.equals("15"))
			return "o";
		else if (ch.equals("16"))
			return "p";
		else if (ch.equals("17"))
			return "q";
		else if (ch.equals("18"))
			return "r";
		else if (ch.equals("19"))
			return "s";
		else if (ch.equals("20"))
			return "t";
		else if (ch.equals("21"))
			return "u";
		else if (ch.equals("22"))
			return "v";
		else if (ch.equals("23"))
			return "w";
		else if (ch.equals("24"))
			return "x";
		else if (ch.equals("25"))
			return "y";
		else if (ch.equals("26"))
			return "z";
		return "";

	}

}
