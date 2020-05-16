package leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class RelativeRanks {

	public static void main(String[] args) {
		int[] nums = { 5, 4, 3, 2, 1 };
		String[] val = new String[nums.length];
		int[] arr = nums.clone();
		Arrays.sort(arr);
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		if (arr.length - 1 >= 0)
			map.put(arr[arr.length - 1], "Gold Medal");
		if (arr.length - 2 >= 0)
			map.put(arr[arr.length - 2], "Silver Medal");
		if (arr.length - 3 >= 0)
			map.put(arr[arr.length - 3], "Bronze Medal");
		int temp = 0;
		for (int i = 0; i < arr.length - 3; i++) {
			map.put(arr[i], String.valueOf(arr.length - temp));
			temp++;
		}
		for (int i = 0; i < nums.length; i++) {
			val[i] = map.get(nums[i]);
		}
		for (String v : val)
			System.out.print(v + " ");
	}

}
