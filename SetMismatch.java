package leetcode;

import java.util.HashSet;
import java.util.Set;

public class SetMismatch {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 2, 4 };
		int[] output = new int[2];
		output[0] = numberdupliate(nums);
		output[1] = numbermissing(nums);
		for (int val : output)
			System.out.print(val + " ");
	}

	private static int numberdupliate(int[] nums) {
		Set<Integer> set = new HashSet<Integer>();
		for (int val : nums) {
			if (set.contains(val))
				return val;
			set.add(val);
		}
		return -1;
	}

	private static int numbermissing(int[] nums) {
		Set<Integer> set = new HashSet<Integer>();
		for (int val : nums) {
			set.add(val);
		}
		int sum = ((nums.length) * (nums.length + 1)) / 2;
		for (int val : set)
			sum = sum - val;
		return sum;
	}

}
