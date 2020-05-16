package leetcode;

import java.util.Stack;

public class ValidParenthesisString {

	public static void main(String[] args) {
		String s = "(*()";
//		System.out.println(parenthesis(s, ""));
		System.out.println(funcparenthesis(s, 0));
		System.out.println(funcparenthesisTD(s, 0, new int[s.length() + 1][s.length() + 1]));
	}

	private static boolean parenthesis(String s, String ans) {
		if (s.length() == 0) {
			return empty(ans);
		}
		char ch = s.charAt(0);
		String ros = s.substring(1);
		boolean res = false;
		if (ch == '(') {
			res = parenthesis(ros, ans + '(');
		} else if (ch == ')') {
			res = parenthesis(ros, ans + ')');
		} else {
			boolean first = parenthesis(ros, ans + '(');
			boolean second = parenthesis(ros, ans + ')');
			boolean third = parenthesis(ros, ans + "");
			res = first || second || third;
		}
		return res;
	}

	private static boolean empty(String s) {
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(')
				stack.push(s.charAt(i));
			if (s.charAt(i) == ')') {
				if (!stack.isEmpty() && stack.peek() == '(')
					stack.pop();
				else
					stack.push(s.charAt(i));
			}
		}
		if (stack.isEmpty())
			return true;
		else
			return false;
	}

	private static boolean funcparenthesis(String s, int open) {
		if (s.length() == 0) {
			if (open == 0)
				return true;
			else
				return false;
		}
		if (open < 0)
			return false;
		char ch = s.charAt(0);
		String ros = s.substring(1);
		boolean res = false;
		if (ch == '(') {
			res = funcparenthesis(ros, open + 1);
		} else if (ch == ')') {
			res = funcparenthesis(ros, open - 1);
		} else {
			res = funcparenthesis(ros, open + 1) || funcparenthesis(ros, open - 1) || funcparenthesis(ros, open);
		}
		return res;
	}

	private static boolean funcparenthesisTD(String s, int open, int[][] strg) {
		if (s.length() == 0) {
			if (open == 0)
				return true;
			else
				return false;
		}
		if (open < 0)
			return false;
		if (strg[s.length()][open] != 0)
			return strg[s.length()][open] == 2 ? true : false;
		char ch = s.charAt(0);
		String ros = s.substring(1);
		boolean res = false;
		if (ch == '(') {
			res = funcparenthesisTD(ros, open + 1, strg);
		} else if (ch == ')') {
			res = funcparenthesisTD(ros, open - 1, strg);
		} else {
			res = funcparenthesisTD(ros, open + 1, strg) || funcparenthesisTD(ros, open - 1, strg)
					|| funcparenthesisTD(ros, open, strg);
		}
		if (res)
			strg[s.length()][open] = 2;
		else
			strg[s.length()][open] = 1;
		return res;
	}

}
