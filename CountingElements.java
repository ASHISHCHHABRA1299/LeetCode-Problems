package leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CountingElements {

	public static void main(String[] args) {
		int[] arr = { 1,1,2,2};
		Set<Integer> set = new HashSet<Integer>();
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			set.add(arr[i]);
		}
		for (int i = 0; i < arr.length; i++) {
			if (set.contains(arr[i] + 1))
				count++;
		}
		System.out.println(count);

	}

}
