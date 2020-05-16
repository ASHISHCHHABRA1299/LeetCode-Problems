package leetcode;

import java.util.HashMap;

public class ContiguousArray {

	public static void main(String[] args) {
//		int[] nums = { 0, 1, 0 };
		int[] nums = { 0, 0, 0, 1, 0, 0 };
//		int maxlength = 0;
//		for (int i = 0; i < nums.length - 1; i++) {
//			int noofzeroes = 0;
//			int noofones = 0;
//			int length = 0;
//			for (int j = i; j < nums.length; j++) {
//				if (nums[j] == 0)
//					noofzeroes++;
//				if (nums[j] == 1)
//					noofones++;
//				if (noofzeroes == noofones) {
//					length = j - i + 1;
//					if (length > maxlength)
//						maxlength = length;
//				}
//			}
//		}
//		System.out.println(maxlength);

//		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
//		int l = 0;
//		int r = 0;
//		int maxlength = 0;
//		while (r < nums.length) {
//			int length = 0;
//			int digit = nums[r];
//			map.put(digit, map.getOrDefault(digit, 0) + 1);
//			if (map.get(0) == map.get(1)) {
//				length = r - l + 1;
//				if (length > maxlength)
//					maxlength = length;
//			}
//			r++;
//		}
//		while (l < r) {
//			int length = 0;
//			int digit = nums[l];			
//			if (map.get(0) == map.get(1)) {
//				length = r - l;
//				if (length > maxlength)
//					maxlength = length;
//			}
//			map.put(digit, map.getOrDefault(digit, 0) - 1);
//			l++;
//		}
//		System.out.println(maxlength);

		HashMap<Integer, Integer> counts = new HashMap<Integer, Integer>();
		counts.put(0, -1);
		int maxlength = 0;
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 0)
				count += -1;
			else
				count += 1;
			if (counts.containsKey(count)) {
				maxlength = Math.max(maxlength, i - counts.get(count));
			} else {
				counts.put(count, i);
			}

		}
		System.out.println(maxlength);
	}
}
