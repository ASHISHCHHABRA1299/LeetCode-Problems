package leetcode;

import java.util.Stack;

public class ScoreOfParentheses {

	public static void main(String[] args) {
		String s = "(())(())(())";
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(') {
				stack.push(s.charAt(i));
			}
			if (s.charAt(i) == ')') {
				if (!stack.isEmpty() && stack.peek() == '(') {
					stack.pop();
					stack.push('1');
				} else {
					int total = 0;
					while (stack.peek() != '(') {
						total += stack.pop() - '0';
					}
					stack.pop();
					stack.push((char) (2*total+'0'));
				}
			}
		}

		int ans = 0;
		while (!stack.isEmpty())
			ans += stack.pop() - '0';
		System.out.println(ans);

	}

}
