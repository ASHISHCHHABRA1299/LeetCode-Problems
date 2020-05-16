package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermutationSequence {

	public static void main(String[] args) {
		int n = 3, k = 3;
//		String s = "";
//		for (int i = 1; i <= n; i++)
//			s = s + i;
//		List<String> l = new ArrayList<String>();
//		sequence(s, "", l);
//		System.out.println(l.get(k - 1));
		int[] nums = new int[n];
		for (int i = 0; i < nums.length; i++)
			nums[i] = i + 1;
		while (k-- > 1) {
			int m = nums.length;
			int i;
			for (i = m - 1; i > 0; i--) {
				if (nums[i] > nums[i - 1])
					break;
			}
			int val = nums[i - 1];
			int min = i;
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[j] < nums[min] && nums[j] > val)
					min = j;
			}
			swap(nums, i - 1, min);
			Arrays.sort(nums, i, n);
		}
		String s = "";
		for (int num : nums)
			s = s + num;
		System.out.println(s);
	}

	private static void sequence(String ques, String ans, List<String> l) {
		if (ques.length() == 0) {
			l.add(ans);
			return;
		}
		for (int i = 0; i < ques.length(); i++) {
			char ch = ques.charAt(i);
			String roq = ques.substring(0, i) + ques.substring(i + 1);
			sequence(roq, ans + ch, l);
		}

	}

	public static void swap(int[] nums, int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}

}