package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class MaximizeSumOfArrayAfterKNegations {

	public static void main(String[] args) {
		int[] a = { 2, -3, -1, 5, -4 };
		int k = 2;
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		for (int val : a)
			pq.add(val);
		while (k-- > 0) {
			int temp = pq.poll();
			pq.offer(-temp);
		}
		int sum = 0;
		while (pq.size() != 0)
			sum += pq.poll();
		System.out.println(sum);
	}

}
