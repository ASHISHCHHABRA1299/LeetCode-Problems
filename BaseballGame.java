package leetcode;

import java.util.Stack;

public class BaseballGame {

	public static void main(String[] args) {
		String[] ops = { "5", "-2", "4", "C", "D", "9", "+", "+" };
		Stack<String> stack = new Stack<String>();
		for (String scan : ops) {
			if (scan.equals("C"))
				stack.pop();
			else if (scan.equals("D")) {
				stack.push(String.valueOf(2 * Integer.parseInt(stack.peek())));
			} else if (scan.equals("+")) {
				String val1 = stack.pop();
				String val2 = stack.pop();
				stack.push(val2);
				stack.push(val1);
				String val3 = String.valueOf(Integer.parseInt(val1) + Integer.parseInt(val2));
				stack.push(val3);
			} else {
				stack.push(scan);
			}
		}

		int sum = 0;
		while (!stack.isEmpty()) {
			sum += Integer.parseInt(stack.pop());
		}
		System.out.println(sum);

	}

}
