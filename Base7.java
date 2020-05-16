package leetcode;

public class Base7 {

	public static void main(String[] args) {
		int num = -7;
		long rem = 0;
		long ans = 0, m = 1;
		while (num != 0) {
			rem = num % 7;
			ans = ans + rem * m;
			m = m * 10;
			num = num / 7;
		}
		System.out.println(String.valueOf(ans));
	}

}
