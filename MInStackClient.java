package leetcode;

public class MInStackClient {

	public static void main(String[] args) {
		MinStack s = new MinStack();
		s.push(-2);
		s.push(0);
		s.push(-3);
		System.out.println(s.getmin());
		s.pop();
		System.out.println(s.top());
		System.out.println(s.getmin());

	}

}
