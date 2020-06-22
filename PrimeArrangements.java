package leetcode;

import java.util.Arrays;

public class PrimeArrangements {

	static int mod = 1000000007;

	public static void main(String[] args) {
		int n = 100;
		boolean[] sieve = new boolean[n + 1];
		Arrays.fill(sieve, true);
		sieve[0] = sieve[1] = false;
		for (int table = 2; table * table <= n; table++) {
			if (sieve[table] == false)
				continue;
			for (int mul = 2; table * mul <= n; mul++) {
				sieve[table * mul] = false;
			}
		}
		long[] fact = new long[n + 1];
		fact[0] = 1;
		for (int i = 1; i <= n; i++) {
			fact[i] = (i * fact[i - 1]) % mod;
		}
		int noofprimes = 0, noofcomposite = 0;
		for (int i = 2; i <= n; i++) {
			if (sieve[i])
				noofprimes++;
		}
		noofcomposite = n - noofprimes;
		System.out.println((int) ((fact[noofprimes] * fact[noofcomposite]) % mod));
	}

}
