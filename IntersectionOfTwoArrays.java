package leetcode;

import java.util.ArrayList;
import java.util.HashMap;

public class IntersectionOfTwoArrays {

	public static void main(String[] args) {
		int[] nums1 = { 1, 2, 2, 1 };
		int[] nums2 = { 2, 2 };
		HashMap<Integer, Boolean> map = new HashMap<Integer, Boolean>();
		for (int num : nums1) {
			if (!map.containsKey(num))
				map.put(num, true);
		}
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int n : nums2) {
			if (map.containsKey(n)) {
				list.add(n);
				map.remove(n);
			}
		}
		int[] arr = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			arr[i] = list.get(i);
		}
		for (int val : arr)
			System.out.print(val + " ");
	}

}
