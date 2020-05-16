package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumAbsoluteDifference {

	public static void main(String[] args) {
		int[] arr = { 4, 1, 2, 3 };
		Arrays.sort(arr);
		int mindiff = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i + 1] - arr[i] < mindiff)
				mindiff = arr[i + 1] - arr[i];
		}
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] - arr[i - 1] == mindiff) {
				List<Integer> l = new ArrayList<Integer>();
				l.add(arr[i] - mindiff);
				l.add(arr[i]);
				list.add(l);
			}
		}
		System.out.println(list);

	}

}
