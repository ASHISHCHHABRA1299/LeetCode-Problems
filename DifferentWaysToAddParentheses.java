package leetcode;

import java.util.ArrayList;
import java.util.List;

public class DifferentWaysToAddParentheses {

	public static void main(String[] args) {
		String input = "2*3-4*5";
		System.out.println(result(input));
	}

	public static List<Integer> result(String s) {
		List<Integer> res = new ArrayList<Integer>();
		if (s.length() == 0)
			return res;

		if (s.length() == 1)
			res.add(Integer.parseInt(s));

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (!isoperator(c))
				continue;
			List<Integer> first = result(s.substring(0, i));
			List<Integer> second = result(s.substring(i + 1));
			for (int f : first) {
				for (int se : second) {
					res.add(calculate(f, se, c));
				}
			}
		}

		return res;
	}

	private static int calculate(int num1, int num2, char operator) {
		int result = 0;

		switch (operator) {
		case '+':
			result = num1 + num2;
			break;

		case '-':
			result = num1 - num2;
			break;

		case '*':
			result = num1 * num2;
			break;
		}

		return result;
	}

	public static boolean isoperator(char c) {
		return (c == '+' || c == '-' || c == '*');
	}

}
