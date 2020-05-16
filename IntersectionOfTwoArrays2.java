package leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class IntersectionOfTwoArrays2 {

	public static void main(String[] args) {
		int[] nums1 = { 1, 2, 2, 1 };
		int[] nums2 = { 2, 2 };
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		int i = 0, j = 0;
		ArrayList<Integer> list = new ArrayList<Integer>();
		while (i < nums1.length && j < nums2.length) {
			if (nums1[i] < nums2[j])
				i++;
			else if (nums1[i] > nums2[j])
				j++;
			else {
				list.add(nums1[i]);
				i++;
				j++;
			}
		}
		System.out.println(list);
	}

}
