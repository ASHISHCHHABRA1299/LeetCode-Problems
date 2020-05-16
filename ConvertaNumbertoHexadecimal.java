package leetcode;

public class ConvertaNumbertoHexadecimal {

	public static void main(String[] args) {
		int num = -1;
		if (num < 0) {
//			int mask = 1;
			int num1 = num;
//			while (mask < num1) {
//				mask = (mask << 1) + 1;
//			}
//			int another = mask ^ num1;
//			num = another | num1;
			num = num1 | (~num1);
		}
		String ans = "";
		while (num != 0) {
			int rem = num % 16;
			ans = gethex(rem) + ans;
			num /= 16;
		}
		System.out.println(ans);
	}

	private static String gethex(int n) {
		String[] hex = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F" };
		return hex[n];
	}

}
