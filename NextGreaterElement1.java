package leetcode;

import java.util.HashMap;
import java.util.Stack;

public class NextGreaterElement1 {

	public static void main(String[] args) {
		int[] nums1 = { 4, 1, 2 };
		int[] nums2 = { 1, 3, 4, 2 };
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(0);
		for (int i = 1; i < nums2.length; i++) {
			while (!stack.isEmpty() && nums2[stack.peek()] < nums2[i]) {
				map.put(nums2[stack.pop()], nums2[i]);
			}
			stack.push(i);
		}
		while (!stack.isEmpty()) {
			map.put(nums2[stack.pop()], -1);
		}
		System.out.println(map);
		int[] output = new int[nums1.length];
		for (int i = 0; i < output.length; i++) {
			output[i] = map.get(nums1[i]);
		}
		for (int val : output)
			System.out.print(val + " ");
	}

}
