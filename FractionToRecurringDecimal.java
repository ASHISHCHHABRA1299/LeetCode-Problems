package leetcode;

import java.util.HashMap;
import java.util.Map;

public class FractionToRecurringDecimal {

	public static void main(String[] args) {
		int numerator = 1, denominator = 6;
		if (numerator == 0) {
			System.out.println("0");
			return;
		}
		if (denominator == 0) {
			System.out.println(" ");
			return;
		}
		StringBuilder res = new StringBuilder();
		if (numerator < 0 || denominator < 0)
			res.append("-");

		long divisor = Math.abs((long) numerator);
		long dividend = Math.abs((long) denominator);
		long remainder = divisor % dividend;
		res.append(divisor / dividend);
		if (remainder == 0) {
			System.out.println(res.toString());
			return;
		}
		res.append(".");
		Map<Long, Integer> pos = new HashMap<Long, Integer>();
		while (remainder != 0) {
			if (pos.containsKey(remainder)) {
				res.insert(pos.get(remainder), "(");
				res.append(")");
				break;
			}
			pos.put(remainder, res.length());
			remainder *= 10;
			res.append(remainder / dividend);
			remainder %= dividend;
		}
		System.out.println(res.toString());
	}

}
