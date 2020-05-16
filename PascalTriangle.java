package leetcode;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {

	public static void main(String[] args) {
		List<List<Integer>> l = new ArrayList<List<Integer>>();
		List<Integer> l1 = new ArrayList<Integer>();
		int n = 6;
		int row = 1;
		int nst = 1;
		while (row <= n) {
			int cst = 1;
			while (cst <= nst) {
				if (cst == 1 || cst == nst) {
					l1.add(1);
					cst = cst + 1;
					continue;
				}
				l1.add(l.get(row - 2).get(cst - 2) + l.get(row - 2).get(cst - 1));

				cst = cst + 1;
			}
			l.add(l1);
			l1 = new ArrayList<Integer>();
			row = row + 1;
			nst = nst + 1;
		}
		System.out.println(l);
	}

}
