package leetcode;

public class BestTimetoBuyandSellStock {

	public static void main(String[] args) {
//		int[] arr = { 7, 1, 5, 3, 6, 4 };
		int[] prices = { 7, 1, 5, 3, 6, 4 };
//		int si=0;
		int maxselling = prices.length - 1;
		int maxdiff = 0;
		for (int i = prices.length - 2; i >= 0; i--) {
			if (prices[i] > prices[maxselling])
				maxselling = i;
			if (prices[i] < prices[maxselling] && prices[maxselling] - prices[i] > maxdiff) {
				maxdiff = prices[maxselling] - prices[i];
//				si=i;
			}
		}
		System.out.println(maxdiff);

	}

}
