package leetcode;

import java.util.Stack;

public class RemoveKDigits {

	public static void main(String[] args) {
		String num = "10";
		int k = 3;
		Stack<Character> stack = new Stack<Character>();
		int size = num.length();
		int count = 0;
		while (count < size) {

			while (k > 0 && !stack.isEmpty() && stack.peek() > num.charAt(count)) {
				stack.pop();
				k--;
			}
			stack.push(num.charAt(count));
			count++;
		}
		while (k > 0) {
			stack.pop();
			k--;
		}
		StringBuilder sb = new StringBuilder();
		while (!stack.isEmpty()) {
			sb.append(stack.pop());
		}
		sb.reverse();
		while (sb.length() > 1 && sb.charAt(0) == '0')
			sb.deleteCharAt(0);
		System.out.println(sb.toString());
	}

}
