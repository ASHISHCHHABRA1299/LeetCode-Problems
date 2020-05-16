package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Combinations {

	public static void main(String[] args) {
		int n = 4;
		int k = 2;
		List<Integer> l1 = new ArrayList<Integer>();
		List<List<Integer>> l = new ArrayList<List<Integer>>();
		combinations(new boolean[n], k, l1, l, 0);
		System.out.println(l);
	}

	private static void combinations(boolean[] board, int k, List<Integer> l1, List<List<Integer>> l, int lastboxused) {
		if (l1.size() == k) {
			l.add(new ArrayList<Integer>(l1));
			return;
		}

		for (int i = lastboxused; i < board.length; i++) {
			if (board[i] == false) {
				board[i] = true;
				l1.add(i + 1);
				combinations(board, k, l1, l, i);
				board[i] = false;
				l1.remove(l1.size() - 1);
			}
		}
	}

}
