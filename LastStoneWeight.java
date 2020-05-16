package leetcode;

import java.util.Comparator;
import java.util.PriorityQueue;

class cmp implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {

		return o2 - o1;
	}

}

public class LastStoneWeight {

	public static void main(String[] args) {
		int[] stones = { 2, 7, 4, 1, 8, 1 };
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>(stones.length, new cmp());
		for (int i = 0; i < stones.length; i++)
			queue.add(stones[i]);
		while (queue.size() != 1) {
			int temp = queue.remove();
			int temp1 = queue.remove();
			queue.add(Math.abs(temp - temp1));
		}
		System.out.println(queue.remove());

	}

}
