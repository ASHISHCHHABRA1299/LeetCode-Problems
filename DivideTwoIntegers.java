package leetcode;

public class DivideTwoIntegers {

	public static void main(String[] args) {
		int dividend = 7;
		int divisor = -3;
			boolean isnegative = false;
	
			if (divisor < 0 && dividend < 0) {
				divisor = -divisor;
				dividend = -dividend;
	
			}
			if (divisor < 0 && dividend > 0) {
				isnegative = true;
				divisor = -divisor;
			}
			if (dividend < 0 && divisor > 0) {
				isnegative = true;
				dividend = -dividend;
			}
			int count = 0;
			int sum = 0;
			while (true) {
				sum += divisor;
				if (sum > dividend)
					break;
				count++;
	
			}
			if (isnegative)
				count = -count;
		System.out.println(count);
	}

}
