package leetcode;

import java.util.Arrays;

public class CoinChange {

	public static void main(String[] args) {
		int[] coins = { 1, 2, 5 };
		int amount = 11;
		int[] strg = new int[amount + 1];
		System.out.println(coinchange(coins, amount));
		System.out.println(coinchangeTD(coins, amount, strg));
		System.out.println(coinchangeBU(coins, amount));
		System.out.println(coinchangeBUE(coins, amount));
	}

	public static int coinchange(int[] coins, int amount) {
		if (amount == 0)
			return 0;
		if (amount < 0)
			return -1;
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < coins.length; i++) {
			int res = coinchange(coins, amount - coins[i]);
			if (res >= 0 && res < min)
				min = res + 1;
		}
		return min == Integer.MAX_VALUE ? -1 : min;
	}

	public static int coinchangeTD(int[] coins, int amount, int[] strg) {
		if (amount == 0)
			return 0;
		if (amount < 0)
			return -1;
		if (strg[amount] != 0)
			return strg[amount];
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < coins.length; i++) {
			int res = coinchangeTD(coins, amount - coins[i], strg);
			if (res >= 0 && res < min)
				min = res + 1;
		}
		return strg[amount] = min == Integer.MAX_VALUE ? -1 : min;
	}

	public static int coinchangeBU(int[] coins, int amount) {
		int[] strg = new int[amount + 1];
		Arrays.fill(strg, amount + 1);
		strg[0] = 0;
		for (int i = 1; i <= amount; i++) {
			for (int j = 0; j < coins.length; j++) {
				if (coins[j] <= i) {
					strg[i] = Math.min(strg[i], strg[i - coins[j]] + 1);
				}
			}
		}
		return strg[amount] == amount + 1 ? -1 : strg[amount];
	}

	public static int coinchangeBUE(int[] coins, int amount) {
		Arrays.sort(coins);
		int[] strg = new int[amount + 1];
		Arrays.fill(strg, amount + 1);
		strg[0] = 0;
		for (int i = 1; i <= amount; i++) {
			for (int j = 0; j < coins.length; j++) {
				if (coins[j] <= i) {
					strg[i] = Math.min(strg[i], strg[i - coins[j]] + 1);
				} else {
					break;
				}
			}
		}
		return strg[amount] == amount + 1 ? -1 : strg[amount];
	}

}
