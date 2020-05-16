package leetcode;

import java.util.HashMap;

public class HappyNumber {

	static HashMap<Integer, Boolean> seen = new HashMap<Integer, Boolean>();

	public static void main(String[] args) {
		int n = 19;
		System.out.println(happy(n));
	}

	public static boolean happy(int n) {
		if (n == 1)
			return true;
		seen.put(n, true);
		int sum = 0;
		while (n > 0) {
			sum += Math.pow(n % 10, 2);
			n /= 10;
		}
		if (seen.containsKey(sum))
			return false;
		boolean ans = false;
		ans = ans || happy(sum);
		return ans;

	}
}
