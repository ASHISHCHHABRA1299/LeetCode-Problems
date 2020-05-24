package leetcode;

public class UglyNumberII {

	public static void main(String[] args) {
		int n = 10;
		int[] ugly = new int[n];
		ugly[0] = 1;
		int num2 = 2, num3 = 3, num5 = 5;
		int i2 = 0, i3 = 0, i5 = 0;

		for (int i = 1; i < ugly.length; i++) {
			int nextugly = Math.min(num2, Math.min(num3, num5));
			ugly[i] = nextugly;
			if (nextugly == num2) {
				i2 += 1;
				num2 = ugly[i2] * 2;
			}
			if (nextugly == num3) {
				i3 += 1;
				num3 = ugly[i3] * 3;
			}
			if (nextugly == num5) {
				i5 += 1;
				num5 = ugly[i5] * 5;
			}
		}
		System.out.println(ugly[ugly.length - 1]);

	}

}
