package leetcode;

public class MinStack {

	int top = -1;
	int toh = -1;
	int[] data = new int[5];
	int[] helper = new int[data.length];

	public void push(int x) {
		if (top == data.length - 1) {
			int[] na = new int[2 * data.length];
			for (int i = 0; i < data.length; i++) {
				na[i] = data[i];
			}
			data = na;
		}
		top = top + 1;
		data[top] = x;
		if (toh == -1) {
			toh = toh + 1;
			helper[toh] = x;
		}
		if (toh != -1 && x < helper[toh]) {
			toh = toh + 1;
			helper[toh] = x;
		}

	}

	public void pop() {
		if (top == -1)
			return;
		int val = data[top];
		if (helper[toh] == val) {
			helper[toh] = 0;
			toh = toh - 1;
		}
		data[top] = 0;
		top = top - 1;
	}

	public int top() {
		return data[top];
	}

	public int getmin() {
		return helper[toh];
	}

}
