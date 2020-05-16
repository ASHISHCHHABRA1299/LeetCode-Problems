package leetcode;

import java.util.LinkedList;

public class ImplementStackUsingQueues {

	LinkedList<Integer> primary = new LinkedList<>();

	/** Push element x onto stack. */
	public void push(int x) {
		primary.addLast(x);
	}

	/** Removes the element on top of the stack and returns that element. */
	public int pop() {
		LinkedList<Integer> helper = new LinkedList<>();
		while (primary.size() != 1) {
			helper.addLast(primary.removeFirst());
		}
		int temp=primary.removeFirst();
		primary=helper;
		return temp;
	}

	/** Get the top element. */
	public int top() {
		LinkedList<Integer> helper = new LinkedList<>();
		while (primary.size() != 1) {
			helper.addLast(primary.removeFirst());
		}
		int temp=primary.removeFirst();
		helper.addLast(temp);
		primary=helper;
		return temp;
	}

	/** Returns whether the stack is empty. */
	public boolean empty() {
		return primary.isEmpty();
	}

}
