package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Triangle {

	public static void main(String[] args) {
		List<List<Integer>> triangle = new ArrayList<List<Integer>>();
		triangle.add(new ArrayList<Integer>(Arrays.asList(2)));
		triangle.add(new ArrayList<Integer>(Arrays.asList(3, 4)));
		triangle.add(new ArrayList<Integer>(Arrays.asList(5, 6, 7)));
		triangle.add(new ArrayList<Integer>(Arrays.asList(4, 1, 8, 3)));
		List<Integer> dp = new ArrayList<Integer>(triangle.get(triangle.size() - 1));
		for (int i = triangle.size() - 2; i >= 0; i--) {
			for (int j = 0; j <= i; j++) {
				dp.set(j, Math.min(dp.get(j), dp.get(j + 1)) + triangle.get(i).get(j));
			}
		}
		System.out.println(dp.get(0));
//		System.out.println(triangle(triangle, 0));

	}

	private static int triangle(List<List<Integer>> l, int vidx) {
		if (vidx == l.size() - 1) {
			List<Integer> l1 = l.get(vidx);
			int min = Integer.MAX_VALUE;
			for (int i = 0; i < l1.size(); i++) {
				min = Math.min(min, l1.get(i));
			}
			return min;
		}

		int minimum = triangle(l, vidx + 1);
		List<Integer> l1 = l.get(vidx);
		int value = minimum + l1.get(0);
		for (int i = 1; i < l1.size(); i++) {
			value = Math.min(value, minimum + l1.get(i));
		}
		return value;
	}

}
