package leetcode;

import java.util.Scanner;
import java.util.Stack;

public class BasicCalculator2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		Stack<Integer> stack = new Stack<Integer>();
		int start = 0;
		int sum = 0;
		char sign='+';
		while (start < s.length()) {
			if (Character.isDigit(s.charAt(start))) {
				sum *= 10;
				sum += s.charAt(start) - '0';
			}
			if (start == s.length() - 1 || !Character.isDigit(s.charAt(start)) && s.charAt(start) != ' ') {
				if (sign== '+')
					stack.push(sum);
				else if (sign == '-')
					stack.push(-sum);
				else if (sign == '*')
					stack.push(stack.pop() * sum);
				else if (sign == '/')
					stack.push(stack.pop() / sum);
				sum = 0;
				sign=s.charAt(start);
			}
			start++;
		}
		int res = 0;
		for (int i : stack)
			res += i;
		System.out.println(res);
	}

}
