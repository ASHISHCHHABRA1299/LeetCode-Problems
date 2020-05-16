package leetcode;

import java.util.List;
import java.util.Stack;

public class RemoveOutermostParentheses {

	public static void main(String[] args) {
		String s = "(()())(())";
		int counter = 0;
		int[] arr = new int[s.length()];
		int i = 0;
		for (char ch : s.toCharArray()) {
			if (ch == '(') {
				counter++;
			} else {
				counter--;
			}
			arr[i++] = counter;
		}
		List<String> l = new Stack<String>();
		int start = 0;
		int end = 0;
		for (int j = 0; j < arr.length; j++) {
			if (arr[j] == 0) {
				end = j;
				l.add(s.substring(start, end + 1));
				start = end + 1;
			}
		}

		StringBuilder sb = new StringBuilder();
		for (int j = 0; j < l.size(); j++) {
			StringBuilder curr = new StringBuilder(l.get(j));
			curr.deleteCharAt(0);
			curr.deleteCharAt(curr.length() - 1);
			sb.append(curr);
		}
		System.out.println(sb.toString());

	}

}
