package leetcode;

import java.util.Arrays;

public class CountPrimes {

	public static void main(String[] args) {
		int n = 10;
		boolean[] primes = new boolean[n + 1];
		Arrays.fill(primes, true);
		primes[0] = primes[1] = false;
		for (int table = 2; table * table < primes.length; table++) {
			if (primes[table]==false)
				continue;
			for (int mul = 2; table * mul < primes.length; mul++) {
				primes[table * mul] = false;
			}
		}
		int count = 0;
		for (int i = 2; i < primes.length; i++) {
			if (primes[i])
				count++;
				
		}
		System.out.println(count);
	}

}
