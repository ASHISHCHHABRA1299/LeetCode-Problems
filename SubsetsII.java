package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetsII {

	public static void main(String[] args) {
		int[] nums = { 5, 5, 5, 5, 5 };
		Arrays.sort(nums);
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		subsets(nums, 0, list, new ArrayList<Integer>());
		System.out.println(list);
	}

	private static void subsets(int[] arr, int vidx, List<List<Integer>> list, List<Integer> l) {
		list.add(new ArrayList<Integer>(l));
		for (int i = vidx; i < arr.length; i++) {
			if (i > vidx && arr[i] == arr[i - 1])
				continue;
			l.add(arr[i]);
			subsets(arr, i + 1, list, l);
			l.remove(l.size() - 1);
		}

	}
}
