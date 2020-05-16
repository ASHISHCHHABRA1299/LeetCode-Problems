package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class RandomPickIndex {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 3, 3 };
		Solution s = new Solution(nums);
		System.out.println(s.pick(3));
		System.out.println(s.pick(1));

	}
}

class Solution {

	Random rand = new Random();
	HashMap<Integer, ArrayList<Integer>> map;

	public Solution(int[] nums) {
		map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(nums[i])) {
				map.get(nums[i]).add(i);
			} else {
				map.put(nums[i], new ArrayList<>());
				map.get(nums[i]).add(i);
			}
		}
	}

	public int pick(int target) {
		ArrayList<Integer> list = map.get(target);
		int index = rand.nextInt(list.size());
		return list.get(index);
	}
}
