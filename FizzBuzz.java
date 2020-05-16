package leetcode;

import java.util.ArrayList;

public class FizzBuzz {

	public static void main(String[] args) {
		int n = 15;
		ArrayList<String> list = new ArrayList<String>();
		for (int i = 1; i <= n; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				list.add("FizzBuzz");
				continue;
			}
			if (i % 5 == 0) {
				list.add("Buzz");
				continue;
			}
			if (i % 3 == 0) {
				list.add("Fizz");
				continue;
			}
			list.add(String.valueOf(i));
		}
		System.out.println(list);
	}

}
