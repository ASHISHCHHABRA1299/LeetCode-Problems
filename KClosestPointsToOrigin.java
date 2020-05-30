package leetcode;

import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

public class KClosestPointsToOrigin {

	class node {
		int x;
		int y;
		int dst;
	}

	class comp implements Comparator<node> {
		@Override
		public int compare(node o1, node o2) {
			return o2.dst - o1.dst;
		}
	}

	public static void main(String[] args) {
		int[][] points = { { 3, 3 }, { 5, -1 }, { -2, 4 } };
		int k = 2;
		KClosestPointsToOrigin knew = new KClosestPointsToOrigin();
		PriorityQueue<node> pq = new PriorityQueue<>(k, knew.new comp());
		for (int i = 0; i < points.length; i++) {
			node n = knew.new node();
			n.x = points[i][0];
			n.y = points[i][1];
			n.dst = (int) Math.pow(points[i][0], 2) + (int) Math.pow(points[i][1], 2);
			if (i < k) {
				pq.offer(n);
			} else {
				if (pq.peek().dst > n.dst) {
					pq.poll();
					pq.offer(n);
				}
			}
		}

		int[][] output = new int[k][2];
		Iterator<node> i = pq.iterator();
		int index = 0;
		while (i.hasNext()) {
			node rn = pq.remove();
			output[index][0] = rn.x;
			output[index][1] = rn.y;
			index++;
		}

		for (int[] o : output) {
			for (int val : o) {
				System.out.print(val + " ");
			}
			System.out.println();
		}
	}

}
