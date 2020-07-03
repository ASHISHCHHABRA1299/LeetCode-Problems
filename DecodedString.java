package leetcode;

import java.util.Stack;

public class DecodedString {

	public static void main(String[] args) {
		String s = "100[leetcode]";
		Stack<Character> stack = new Stack<Character>();
		for (char c : s.toCharArray())
			stack.push(c);
		StringBuilder res = new StringBuilder();
		StringBuilder s1 = new StringBuilder();
		int number = 0;
		int mul = 1;
		while (!stack.isEmpty()) {
			char ch = stack.pop();
			if (ch == ']') {
				if (s1.length() != 0) {
					res.insert(0, s1);
					s1 = new StringBuilder();
				}
			} else if (Character.isDigit(ch)) {
				number = number + (ch - '0') * mul;
				mul *= 10;
				if (!stack.isEmpty() && !Character.isDigit(stack.peek())) {
					String snew = s1.toString();
					while (number-- > 1)
						s1.insert(0, snew);
				} else {
					String snew = s1.toString();
					while (number-- > 1)
						s1.insert(0, snew);
				}
			} else if (ch != '[') {
				s1.insert(0, ch);
			} else {
				number = 0;
				mul = 1;
			}
		}

		if (s1.length() != 0)
			res.insert(0, s1);
		System.out.println(res.toString());

	}

}
