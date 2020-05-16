package leetcode;

import java.util.HashSet;
import java.util.Set;

public class FindTheTownJudge {

	public static void main(String[] args) {
		int[][] trust = { { 1, 2 } };
		int N = 2;
		int flag = 0;
//		int[] arr = new int[N + 1];
//		for (int i = 0; i < trust.length; i++) {
//			arr[trust[i][0]] += 1;
//		}
//		int judge = -1;
//		for (int i = 1; i < N + 1; i++) {
//			if (arr[i] == 0)
//				judge = i;
//		}
//		Set<Integer> set = new HashSet<>();
//		for (int i = 0; i < trust.length; i++) {
//			if (trust[i][1] == judge)
//				set.add(trust[i][0]);
//		}
//
//		for (int i = 1; i <= N; i++) {
//			if (judge != -1 && i == judge)
//				continue;
//			if (!set.contains(i)) {
//				flag = 1;
//				break;
//			}
//		}
//		if (flag == 0)
//			System.out.println(judge);
//		else
//			System.out.println(-1);
		long start = System.currentTimeMillis();
		int si = -1;
		int[] arr = new int[N + 1];
		for (int i = 0; i < trust.length; i++) {
			arr[trust[i][0]] -= 1;
			arr[trust[i][1]] += 1;
		}

		for (int i = 1; i < N + 1; i++) {
			if (arr[i] == N - 1) {
				si = i;
				flag = 1;
				break;
			}
		}
		if (flag == 1)
			System.out.println(si);
		else
			System.out.println(-1);
		long end = System.currentTimeMillis();
		System.out.println(end - start);
	}

}
