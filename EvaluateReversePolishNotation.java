package leetcode;

import java.util.Stack;

public class EvaluateReversePolishNotation {

	public static void main(String[] args) {
		String[] tokens = { "2", "1", "+", "3", "*" };
		Stack<Integer> stack = new Stack<Integer>();
		for (String val : tokens) {
			if (val.equals("+")) {
				int temp = stack.pop();
				int temp1 = stack.pop();
				stack.push(temp1 + temp);

			} else if (val.equals("-")) {
				int temp = stack.pop();
				int temp1 = stack.pop();
				stack.push(temp1 - temp);

			} else if (val.equals("*")) {
				int temp = stack.pop();
				int temp1 = stack.pop();
				stack.push(temp1 * temp);

			} else if (val.equals("/")) {
				int temp = stack.pop();
				int temp1 = stack.pop();
				stack.push(temp1 / temp);

			} else {
				stack.push(Integer.parseInt(val));
			}
		}
		System.out.println(stack.peek());

	}

}
