package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {

	public static void main(String[] args) {
		int[] nums = { 1, 0, -1, 0, -2, 2 };
		int target = 0;
		Arrays.sort(nums);
		List<List<Integer>> l1 = new ArrayList<>();
		for (int i = 0; i < nums.length; i++) {
			if (i > 0 && nums[i] == nums[i - 1])
				continue;
			for (int j = i + 1; j < nums.length; j++) {
				if (j > i + 1 && nums[j] == nums[j - 1]) {
					continue;
				}
				int left = j + 1;
				int right = nums.length - 1;
				while (left < right) {
					int sum = nums[i] + nums[j] + nums[left] + nums[right];
					if (sum == target) {
						List<Integer> l = new ArrayList<Integer>();
						l.add(nums[i]);
						l.add(nums[j]);
						l.add(nums[left]);
						l.add(nums[right]);
						l1.add(l);
						int leftvalue = nums[left];
						while (left < nums.length && leftvalue == nums[left])
							left++;
						int rightvalue = nums[right];
						while (right > left && rightvalue == nums[right])
							right--;
					} else if (sum < target)
						left++;
					else
						right--;
				}

			}
		}
		System.out.println(l1);
	}

}
