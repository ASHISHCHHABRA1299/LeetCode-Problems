package leetcode;

public class PowXN {

	public static void main(String[] args) {
		double x = -2.00000;
		int n = -5;
		int flag = 1;
		int flag1 = 1;
		if (x < 0) {
			flag1 = 0;
			x = -x;
		}
		if (n < 0) {
			flag = 0;
			n = -n;
		}
		double k = x;
		for (int i = 1; i < n; i++) {
			x *= k;
		}

		if (flag == 0 && flag1 == 0) {
			x = 1 / x;
			if (n % 2 == 1)
				x = -x;

		}
		if (flag1 == 0 && flag == 1) {
			if (n % 2 == 1)
				x = -x;

		}

		if (flag1 == 1 && flag == 0)
			x = 1 / x;

		System.out.println((double) x);
   
		
		}

}
