package leetcode;

import java.util.Arrays;

public class PerfectSquares {

	public static void main(String[] args) {
		int n = 13;
		System.out.println(squaresTD(n, new int[n + 1]));
		System.out.println(squaresBU(n));
	}

	public static int squaresTD(int n, int[] strg) {
		if (n == 0)
			return 0;
		if (n < 0)
			return -1;
		if (strg[n] != 0)
			return strg[n];
		int min = Integer.MAX_VALUE;
		for (int j = 1; j * j <= n; j++) {
			min = Math.min(min, squaresTD(n - (j * j), strg) + 1);
		}
		return strg[n] = min;
	}

	public static int squaresBU(int n) {
		int strg[] = new int[n + 1];
		Arrays.fill(strg, n);
		strg[0] = 0;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j * j <= i; j++) {
				strg[i] = Math.min(strg[i], strg[i - (j * j)] + 1);
			}
		}
		return strg[n];
	}
}
