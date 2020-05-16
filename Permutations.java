package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Permutations {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3 };
		List<Integer> l1 = new ArrayList<Integer>();
		List<List<Integer>> l = new ArrayList<List<Integer>>();
//		permutation(nums, 0, l1, l);
		permutation1(nums, new boolean[nums.length], l1, l);
		System.out.println(l);
	}

	private static void permutation(int[] arr, int vidx, List<Integer> l1, List<List<Integer>> l) {
		if (vidx == arr.length) {
			l.add(new ArrayList<>(l1));
			return;
		}
		int val = arr[vidx];
		for (int i = 0; i <= l1.size(); i++) {
			l1.add(i, val);
			permutation(arr, vidx + 1, l1, l);
			l1.remove(i);
		}

	}

	private static void permutation1(int[] arr, boolean[] used, List<Integer> l1, List<List<Integer>> l) {
		if (l1.size() == arr.length) {
			l.add(new ArrayList<Integer>(l1));
			return;
		}
		for (int i = 0; i < arr.length; i++) {
			if (used[i])
				continue;
			used[i] = true;
			l1.add(arr[i]);
			permutation1(arr, used, l1, l);
			l1.remove(l1.size() - 1);
			used[i] = false;
		}
	}

}
