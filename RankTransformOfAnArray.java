package leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class RankTransformOfAnArray {

	public static void main(String[] args) {
		int[] arr = { 40, 10, 20, 30 };
		int[] nums = arr.clone();
		Arrays.sort(nums);
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int j = 1;
		for (int i = 0; i < nums.length; i++) {
			if (!map.containsKey(nums[i])) {
				map.put(nums[i], j);
				j++;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			arr[i] = map.get(arr[i]);
		}
		for (int val : arr)
			System.out.print(val + " ");

	}

}
