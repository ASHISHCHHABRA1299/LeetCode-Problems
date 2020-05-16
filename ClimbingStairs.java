package leetcode;

import java.util.Arrays;

public class ClimbingStairs {

	public static void main(String[] args) {
		int n = 3;
		int[] arr = { 1, 2 };
		int[] strg = new int[n];
		Arrays.fill(strg, -1);
		System.out.println(climb(n, arr));
		System.out.println(climbTD(n, arr, strg));
	}

	private static int climb(int n, int[] arr) {
		if (n == 0)
			return 1;
		if (n < 0)
			return 0;
		int count = 0;
		for (int i = 0; i < arr.length; i++)
			count += climb(n - arr[i], arr);
		return count;
	}

	private static int climbTD(int n, int[] arr, int[] strg) {

		if (n == 0)
			return 1;
		if (n < 0)
			return 0;
		if (strg[n - 1] != -1)
			return strg[n - 1];
		int d = 0;
		for (int i = 0; i < arr.length; i++) {
			d += climbTD(n - arr[i], arr, strg);
		}

		strg[n - 1] = d;
		return strg[n - 1];
	}

	public static int climbBU(int n) {
		if (n == 1)
			return 1;
		int[] strg = new int[n + 1];
		strg[1] = 1;
		strg[2] = 2;
		for (int i = 3; i <= n; i++) {
			strg[i] = strg[i - 1] + strg[i - 2];
		}
		return strg[n];
	}
}
