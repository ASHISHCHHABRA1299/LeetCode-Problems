package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermutationsII {

	public static void main(String[] args) {
		int[] nums = { 1, 1, 2 };
		Arrays.sort(nums);
		List<Integer> l1 = new ArrayList<Integer>();
		List<List<Integer>> l = new ArrayList<List<Integer>>();
		permutation1(nums, new boolean[nums.length], l1, l);
		System.out.println(l);
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
			while (i + 1 < arr.length && arr[i] == arr[i + 1])
				i++;
		}
	}

}
