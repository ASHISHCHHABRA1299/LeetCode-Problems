package leetcode;

import java.util.Comparator;
import java.util.PriorityQueue;

class matrixcomparator implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		return o2 - o1;
	}

}

public class KthSmallestElementInASortedMatrix2 {

	public static void main(String[] args) {
		int[][] matrix = { { 1, 5, 9 }, { 10, 11, 13 }, { 12, 13, 15 } };
		int k = 8;
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(matrix.length * matrix[0].length,
				new matrixcomparator());
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				pq.add(matrix[i][j]);
			}
		}
		int index = matrix.length * matrix[0].length - k;
		for (int i = 0; i < index; i++)
			pq.remove();

		System.out.println(pq.remove());
	}

}
