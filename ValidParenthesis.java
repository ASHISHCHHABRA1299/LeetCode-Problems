package leetcode;

import java.util.Stack;

public class ValidParenthesis {

	public static void main(String[] args) {
		String s = "}";
		Stack<Character> s1 = new Stack<Character>();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '{' || s.charAt(i) == '(' || s.charAt(i) == '[') {
				s1.push(s.charAt(i));
			}
			Character ch = ' ';
			if (s.charAt(i) == '}') {
				if (!s1.isEmpty()) {
					ch = s1.peek();
				}
				if (ch == '{') {
					s1.pop();
					continue;
				}
				s1.push(s.charAt(i));

			}
			if (s.charAt(i) == ']') {
				if (!s1.isEmpty()) {
					ch = s1.peek();
				}
				if (ch == '[') {
					s1.pop();
					continue;
				}
				s1.push(s.charAt(i));

			}
			if (s.charAt(i) == ')') {
				if (!s1.isEmpty()) {
					ch = s1.peek();
				}
				if (ch == '(') {
					s1.pop();
					continue;
				}
				s1.push(s.charAt(i));

			}
		}
		if (s1.isEmpty())
			System.out.println(true);
		else
			System.out.println(false);
	}

}
