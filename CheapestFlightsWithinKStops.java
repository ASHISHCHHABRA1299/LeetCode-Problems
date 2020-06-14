package leetcode;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;

public class CheapestFlightsWithinKStops {

	public static void main(String[] args) {
		int[][] flights = { { 0, 1, 100 }, { 1, 2, 100 }, { 0, 2, 500 } };
		int n = 3;
		int src = 0, dst = 2, k = 1;
		HashMap<Integer, List<int[]>> map = new HashMap<Integer, List<int[]>>();
		for (int[] f : flights) {
			map.putIfAbsent(f[0], new ArrayList<int[]>());
			map.get(f[0]).add(new int[] { f[1], f[2] });
		}
		PriorityQueue<int[]> pq = new PriorityQueue<int[]>(new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				return Integer.compare(o1[1], o2[1]);
			}
		});
		pq.offer(new int[] { src, 0, k });
		while (!pq.isEmpty()) {
			int[] c = pq.poll();
			int curr = c[0];
			int cost = c[1];
			int stop = c[2];
			if (curr == dst) {
				System.out.println(cost);
				return;
			}
			if (stop >= 0) {
				if (!map.containsKey(curr))
					continue;
				for (int[] val : map.get(curr)) {
					pq.offer(new int[] { val[0], cost + val[1], stop - 1 });
				}
			}
		}
		System.out.println(-1);
	}

}
