package leetcode;

import java.util.HashMap;

public class FractionToRecurringDecimal {

	public static void main(String[] args) {
		int numerator = 2, denominator = 3;
		if (numerator == 0) {
			System.out.println("0");
			return;
		}
		if (denominator == 0) {
			System.out.println(" ");
			return;
		}
		String res = "";
		if (numerator < 0 || denominator < 0)
			res += "-";

		long num = Math.abs((long) numerator), denom = Math.abs((long) denominator);
		res += String.valueOf(num / denom);
		long remainder = (num % denom) * 10;
		if (remainder == 0) {
			System.out.println(res);
			return;
		}
		res += ".";
		HashMap<Long, Boolean> map = new HashMap<Long, Boolean>();
		num = remainder * 10;
		map.put(num / denom, true);
		remainder = num % denom;
		if (remainder == 0) {
			res += String.valueOf(num / denom);
			map.remove(num / denom);
			System.out.println(res);
			return;
		} else {
			res += "(";
		}
		while (!map.isEmpty()) {
			remainder *= 10;
			if (map.containsKey(remainder / denom)) {
				res += String.valueOf(remainder / denom);
				map.remove(remainder / denom);
			} else {
				map.put(remainder / denom, true);

			}
			remainder = remainder % denom;
		}
		res += ")";

		System.out.println(res);
	}

}
