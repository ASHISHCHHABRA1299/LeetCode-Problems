package leetcode;

public class NumberComplement {

	public static void main(String[] args) {
		int num = -1;
//		int mul = 1;
//		int number = 0;
//		while (num > 0) {
//			if (((num & 1) ^ 1) == 1) {
//				number += mul;
//			}
//			mul = mul * 2;
//			num = num >> 1;
//		}
//		System.out.println(number);

		int mask = 1;
		while (mask < num) {
			mask = (mask << 1) + 1;
		}
		System.out.println(num ^ mask);
	}

}
