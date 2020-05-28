package leetcode;

import java.util.LinkedList;
import java.util.List;

public class PascalTrangleII {

	public static void main(String[] args) {
		int n = 3;
		List<Integer> l = new LinkedList<Integer>();
		l.add(1);
		for (int i = 1; i <= n; i++) {
			for (int j = i - 1; j > 0; j--) {
				l.set(j, l.get(j) + l.get(j - 1));
			}
			l.add(1);
		}
		System.out.println(l);
	}

}
