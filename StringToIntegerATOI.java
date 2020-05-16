package leetcode;

public class StringToIntegerATOI {

	public static void main(String[] args) {
		String s = "-91283472332";
//		String s = "words and 987";
		double result = 0;
		boolean isnegative = false;
		s = s.trim();
		// index where to begin
		int startIndex = 0;
		// empty String
		if (s.length() == 0) {
			System.out.println(0);
			return;
		}
		// handle negative and positive
		if (s.charAt(0) == '+' || s.charAt(0) == '-')
			startIndex++;
		// handling negative
		if (s.charAt(0) == '-')
			isnegative = true;
		// loop through the string
		for (int i = startIndex; i < s.length(); i++) {
			// non numerical character
			if (s.charAt(i) < '0' || s.charAt(i) > '9')
				break;
			result = result * 10 + s.charAt(i) - '0';
		}
		// check the number is negative or not
		if (isnegative)
			result = -result;
		// out of integer range
		if (result > Integer.MAX_VALUE) {
			System.out.println(Integer.MAX_VALUE);
			return;
		}
		if (result < Integer.MIN_VALUE) {
			System.out.println(Integer.MIN_VALUE);
			return;
		}
		// double to int
		System.out.println((int) result);
	}

}
