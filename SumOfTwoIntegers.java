package leetcode;

public class SumOfTwoIntegers {

	public static void main(String[] args) {

		int a = -2;
		int b = -4;
		int sum = 0;
		int carry = -1;
		while (carry != 0) {
			carry = a & b;
			sum = a ^ b;
			carry = carry << 1;
			a = sum;
			b = carry;
		}
		System.out.println(sum);
	}

}
