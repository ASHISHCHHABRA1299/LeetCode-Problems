package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Subsets {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3 };
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		subsets(nums, 0, list, new ArrayList<Integer>());
//		int n = nums.length;
//		int limit = (int) Math.pow(2, n);
//		for (int i = 0; i < limit; i++) {
//			List<Integer> l = new ArrayList<Integer>();
//			int idx = nums.length - 1;
//			int k = i;
//			while (k > 0) {
//				int rem = k % 2;
//				if (rem == 1) {
//					l.add(0,nums[idx]);
//				}
//				idx--;
//				k /= 2;
//			}
//			list.add(l);
//		}
		System.out.println(list);
	}

	private static void subset(int[] arr, int vidx, List<List<Integer>> list, List<Integer> l) {
		if (vidx == arr.length) {
			list.add(new ArrayList<Integer>(l));
			return;
		}
		subset(arr, vidx + 1, list, l);
		l.add(arr[vidx]);
		subset(arr, vidx + 1, list, l);
		l.remove(l.size() - 1);

	}

	private static void subsets(int[] arr, int vidx, List<List<Integer>> list, List<Integer> l)
	{
		System.out.println(l);
		list.add(new ArrayList<Integer>(l));
	    for(int i=vidx;i<arr.length;i++)
	    {
	    	l.add(arr[i]);
	    	subsets(arr, i+1, list, l);
	    	l.remove(l.size()-1);
	    }
		 
	}

}
