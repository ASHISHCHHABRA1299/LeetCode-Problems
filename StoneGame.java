package leetcode;

public class StoneGame {

	public static void main(String[] args) {
		int[] piles = { 1, 14, 10, 3 };
		int totalsum = 0;
		for (int v : piles)
			totalsum += v;
//		int value = stonegame(piles, 0, piles.length - 1, 0);
		int value = stonegameTD(piles, 0, piles.length - 1, 0, new int[piles.length + 1][piles.length + 1]);
		if (totalsum - value < value)
			System.out.println(true);
		else
			System.out.println(false);
	}

	private static int stonegame(int[] piles, int si, int ei, int count) {
		if (count == piles.length / 2)
			return 0;

		return Math.max(stonegame(piles, si + 1, ei, count + 1) + piles[si],
				stonegame(piles, si, ei - 1, count + 1) + piles[ei]);
	}

	private static int stonegameTD(int[] piles, int si, int ei, int count, int[][] strg) {
		if (count == piles.length / 2)
			return 0;
		if (strg[si][ei] != 0)
			return strg[si][ei];

		return strg[si][ei] = Math.max(stonegameTD(piles, si + 1, ei, count + 1, strg) + piles[si],
				stonegameTD(piles, si, ei - 1, count + 1, strg) + piles[ei]);
	}

}
