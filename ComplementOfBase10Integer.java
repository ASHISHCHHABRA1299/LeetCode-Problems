package leetcode;

public class ComplementOfBase10Integer {

	public static void main(String[] args) {
		int N = 5;
		int result = 0;
		int power = 1;
		while (N > 0) {
			result += (N % 2 ^ 1) * power;
			power <<= 1;
			N >>= 1;
		}
		System.out.println(result);
	}

}
