package leetcode;

public class PowerOfTwo {

	public static void main(String[] args) {
		int n = 8;
//		System.out.println(power(n));
//		long i = 1;
//		while (i < n) {
//			i *= 2;
//		}
//		if(i==n)
//			System.out.println(true);
//		else
//			System.out.println(false);
		int count = 0;
		int flag = 0;
		for (int i = 0; i < 32; i++) {
			if ((n & (1 << i)) == n) {
				if (i % 2 == 0) {
					count++;
				}
//				else {
//					flag = 1;
//					break;
//				}
			}
		}
//		if (flag == 1) {
//			System.out.println(false);
//			return;
//		}
		if (count == 1)
			System.out.println(true);
		else
			System.out.println(false);

	}

	private static boolean power(int n) {
		if (n == 1)
			return true;
		boolean ans = (n % 2 == 0) ? power(n / 2) : false;
		return ans;
	}

}
