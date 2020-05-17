package leetcode;

public class XOfAKindInADeckOfCards {

	public static void main(String[] args) {
		int[] deck = { 1, 2, 3, 4, 4, 3, 2, 1 };
		int[] count = new int[10000];
		for (int val : deck)
			count[val]++;
		int gcd = -1;
		for (int val : count) {
			if (val > 0) {
				if (gcd == -1) {
					gcd = val;
				} else {
					gcd = gcdc(gcd, val);
				}
			}
		}
		if (gcd > 1)
			System.out.println(true);
		else
			System.out.println(false);

	}

	private static int gcdc(int a, int b) {
		return a == 0 ? b : gcdc(b % a, a);
	}

}
