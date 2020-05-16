package leetcode;

import java.util.Stack;

public class RemoveAllAdjacentDuplicatesInString {

	public static void main(String[] args) {
		String s = "abbaca";
		Stack<Character> stack = new Stack<Character>();
		for (char c : s.toCharArray()) {
			if (stack.isEmpty() || stack.peek() != c)
				stack.push(c);
			else
				stack.pop();
		}
		StringBuilder sb = new StringBuilder();
		while (!stack.isEmpty())
			sb.insert(0, stack.pop());
		
		System.out.println(sb.toString());

	}

}
