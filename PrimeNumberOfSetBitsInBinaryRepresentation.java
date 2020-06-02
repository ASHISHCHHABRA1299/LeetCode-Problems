package leetcode;

public class PrimeNumberOfSetBitsInBinaryRepresentation {

	public static void main(String[] args) {
		int l = 6;
		int r = 10;
		int ans = 0;
		for (int x = l; x <= r; ++x)
			if (isSmallPrime(Integer.bitCount(x)))
				ans++;
		System.out.println(ans);

	}

	public static boolean isSmallPrime(int x) {
		return (x == 2 || x == 3 || x == 5 || x == 7 || x == 11 || x == 13 || x == 17 || x == 19);
	}

}
