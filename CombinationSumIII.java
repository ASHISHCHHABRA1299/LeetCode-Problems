package leetcode;

import java.util.ArrayList;
import java.util.List;

public class CombinationSumIII {

	public static void main(String[] args) {
		int k = 3;
		int n = 9;
		List<Integer> l = new ArrayList<Integer>();
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		combination(k, n, l, list, 0, 1);
		System.out.println(list);
	}

	private static void combination(int k, int n, List<Integer> l, List<List<Integer>> list, int sum, int lastused) {
		if (l.size() == k && sum == n) {
			list.add(new ArrayList<Integer>(l));
			l = new ArrayList<Integer>();
			return;
		}
		if (l.size() > k)
			return;
		for (int i = lastused; i < 10; i++) {
			l.add(i);
			sum += i;
			combination(k, n, l, list, sum, i + 1);
			l.remove(l.size() - 1);
			sum -= i;
		}
	}

}
