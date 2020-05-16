package leetcode;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicate {

	public static void main(String[] args) {
		int[] nums = { 1, 4, 6, 6, 6, 2, 3 };
//		Set<Integer> set = new HashSet<Integer>();
//		for (int i = 0; i < nums.length; i++) {
//			if (set.contains(nums[i])) {
//				System.out.println(nums[i]);
//				return;
//			}
//			set.add(nums[i]);
//		}
		int tortoise = nums[0];
		int rabbit = nums[0];
		tortoise = nums[nums[0]];
		rabbit = nums[nums[nums[0]]];
		while (tortoise != rabbit) {
			tortoise = nums[tortoise];
			rabbit = nums[nums[rabbit]];
		}
		int ptr = nums[0];
		int ptr1 = tortoise;
		while (ptr != ptr1) {
			ptr = nums[ptr];
			ptr1 = nums[ptr1];
		}
		
		System.out.println(ptr);

		// one method is to sort and check the array using the loop
		// second method is to use the set and checks for every element is present or
		// not
		// third method Floyd's Tortoise and Hare (Cycle Detection)= to detect the loop
		// or the cycle as we do in the linked list

	}

}
