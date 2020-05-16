package leetcode;

public class BestTimetoBuyandSellStock2 {

	public static void main(String[] args) {
//		int[] prices = { 7, 1, 5, 3, 6, 4 };
//		int[] prices = { 1, 2, 3, 4, 5 };
//		int[] prices = { 7, 6, 4, 3, 1 };
//		int[] prices= {2,1,2,0,1};
//		int[] prices= {3,3,5,0,0,3,1,4};
		int[] prices = { 1, 2, 4, 2, 5, 7, 2, 4, 9, 0 };
		int maxselling = prices.length - 1;
		int maxdiff = 0;
		int totalsumdiff = 0;
		int si = -1;
		for (int i = prices.length - 2; i >= 0; i--) {

			if (prices[i] > prices[maxselling]) {
				maxselling = i;
				continue;
			}
			if (prices[i] < prices[maxselling] && prices[maxselling] - prices[i] > maxdiff) {
				maxdiff = prices[maxselling] - prices[i];
				si = i;
			}
			if (si != -1) {
				totalsumdiff += maxdiff;
				maxselling = i;
				maxdiff = 0;
				si = -1;
			}
		}
		if (totalsumdiff == 0)
			System.out.println(maxdiff);
		else
			System.out.println(totalsumdiff);
	}

}
