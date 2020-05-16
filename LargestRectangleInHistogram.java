package leetcode;

import java.util.Stack;

public class LargestRectangleInHistogram {

	public static void main(String[] args) {
		int[] heights = { 2, 1, 5, 6, 2, 3 };
		Stack<Integer> stack = new Stack<Integer>();
		int maxarea = Integer.MIN_VALUE;
		int area = 0;
		stack.push(0);
		int i = 0;
		while (i < heights.length) {
			if (stack.isEmpty() || heights[i] > heights[stack.peek()]) {
				stack.push(i);
				i++;
			} else {
				int top = stack.pop();
				if (stack.isEmpty()) {
					area = heights[top] * (i);
				} else {
					area = (i - stack.peek() - 1) * heights[top];
				}
				if (area > maxarea)
					maxarea = area;
			}

		}
		while (!stack.isEmpty()) {
			int top = stack.pop();
			if (stack.isEmpty()) {
				area = heights[top] * (i);
			} else {
				area = (i - stack.peek() - 1) * heights[top];
			}
			if (area > maxarea)
				maxarea = area;
		}

		System.out.println(maxarea);
	}

}
