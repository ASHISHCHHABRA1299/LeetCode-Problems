package leetcode;

import java.util.Stack;

public class ImplementQueueusingStacks {
	Stack<Integer> primary = new Stack<Integer>();

	/** Push element x to the back of queue. */
	public void push(int x) {
		primary.push(x);

	}

	/** Removes the element from in front of queue and returns that element. */
	public int pop() {
		Stack<Integer> helper = new Stack<Integer>();	
        while(primary.size()!=1)
        {
        	helper.push(primary.pop());
        }
        int temp=primary.pop();
		while(!helper.isEmpty())
		{
			primary.push(helper.pop());
		}
        return temp;

	}

	/** Get the front element. */
	public int peek() {
		Stack<Integer> helper = new Stack<Integer>();	
        while(primary.size()!=1)
        {
        	helper.push(primary.pop());
        }
        int temp=primary.pop();
        primary.push(temp);
		while(!helper.isEmpty())
		{
			primary.push(helper.pop());
		}
        return temp;
	}

	/** Returns whether the queue is empty. */
	public boolean empty() {
		return primary.isEmpty();
	}
}
