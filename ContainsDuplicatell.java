package leetcode;

import java.util.HashMap;

public class ContainsDuplicatell {

	public static void main(String[] args) {
		int[] nums = {1,2,3,1,2,3 };
		int k = 2;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int i = 0;
		int flag = 0;
		while (i < nums.length) {
			if (map.containsKey(nums[i])) {
				if (i - map.get(nums[i]) <= k) {
					flag = 1;
					break;
				} else {
					map.put(nums[i], i);
				}
			} else {
				map.put(nums[i], i);
			}
			i++;
		}
		if (flag == 1)
			System.out.println(true);
		else
			System.out.println(false);

	}

}
