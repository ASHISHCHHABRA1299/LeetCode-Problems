package leetcode;

import java.util.Stack;

public class MinStack1 {

	Stack<Integer> stack = new Stack<Integer>();
	Stack<Integer> helper = new Stack<Integer>();

	public void push(int x) {
		if (stack.isEmpty() || x <= helper.peek())
			helper.push(x);
		stack.push(x);
	}
 
	public void pop() {
		if (stack.peek().equals(helper.peek()))
			helper.pop();
		stack.pop();
	}

	public int top() {
		return stack.peek();

	}

	public int getMin() {
		return helper.peek();
	}
}
/*
 * class MinStack {
 * 
 * int [] array; int min; int size; int currentMin;
 * 
 * public MinStack() { array = new int[100]; size = 0; currentMin =
 * Integer.MAX_VALUE; }
 * 
 * public void push(int x) { if(array.length==size){ int [] temp = new int
 * [size*2]; for(int i = 0 ; i < size; i ++){ temp[i] = array[i]; } array =
 * temp; } array[size] = x; if(x < currentMin){ currentMin = x; } size++; }
 * 
 * public void pop() { if(array[size-1] == currentMin){ currentMin =
 * Integer.MAX_VALUE; for(int i = 0; i < size-1; i++){ if(array[i] <
 * currentMin){ currentMin = array[i]; } } } size--; }
 * 
 * public int top() { return array[size-1]; }
 * 
 * public int getMin() { return currentMin; } }
 * 
 */
