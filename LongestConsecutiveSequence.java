package leetcode;

import java.util.HashMap;

public class LongestConsecutiveSequence {

	public static void main(String[] args) {
		int[] nums = { 100, 4, 200, 1, 3, 2 };
		HashMap<Integer, Boolean> map = new HashMap<Integer, Boolean>();
		int maxcount = Integer.MIN_VALUE;
		int starting = 0;
		for (int i = 0; i < nums.length; i++) {
			int item = nums[i];
			if (map.containsKey(item - 1))
				map.put(item, false);
			else
				map.put(item, true);
			if (map.containsKey(item + 1))
				map.put(item + 1, false);
		}
		// map keyset
		for (int keys : map.keySet()) {
			int count = 0;
			if (map.get(keys)) {
				while (map.containsKey(keys + count))
					count++;
			}
			if (count > maxcount) {
				maxcount = count;
				starting = keys;
			}
		}
//
//		// print series
//		for (int i = 0; i < maxcount; i++) {
//			System.out.print(starting + i+" ");
//		}
//		System.out.println();
		System.out.println(maxcount);
	}

}
