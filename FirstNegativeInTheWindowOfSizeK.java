package leetcode;

import java.util.LinkedList;

public class FirstNegativeInTheWindowOfSizeK {

	public static void main(String[] args) {
		int[] nums = { 12, -1, -7, 8, -15, 30, 16, 28 };
		int k = 3;
		LinkedList<Integer> queue = new LinkedList<Integer>();
		int i = 0;
		for (; i < k; i++) {
			if (nums[i] < 0)
				queue.addLast(i);
		}
		for (; i < nums.length; i++) {
			if (!queue.isEmpty()) {
				System.out.print(nums[queue.getFirst()] + " ");
			} else {
				System.out.print(0 + " ");
			}
			while (!queue.isEmpty() && queue.getFirst() <= i - k) {
				queue.removeFirst();
			}
			if (nums[i] < 0)
				queue.addLast(i);
		}
		if (queue.isEmpty())
			System.out.print(0 + " ");
		else
			System.out.print(nums[queue.getFirst()] + " ");

	}

}
