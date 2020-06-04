package leetcode;

public class MinCostClimbing {

	public static void main(String[] args) {
		int[] cost = { 1, 100, 1, 1, 1, 100, 1, 1, 100, 1 };
		// greedy Solution
//		for (int i = 2; i < cost.length; i++) {
//			cost[i] += Math.min(cost[i - 1], cost[i - 2]);
//		}
//		System.out.println(Math.min(cost[cost.length - 1], cost[cost.length - 2]));

		// dynamic Programming
		int f1 = 0;
		int f2 = 0;
		for (int i = cost.length - 1; i >= 0; i--) {
			int f0 = cost[i] + Math.min(f1, f2);
			f2 = f1;
			f1 = f0;
		}
		System.out.println(Math.min(f1, f2));
	}

}
