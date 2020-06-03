package leetcode;

import java.util.ArrayList;
import java.util.List;

public class DecompressRun_LengthEncodedList {

	public static void main(String[] args) {
		int[] nums = {1,1,2,3};
		List<Integer> l = new ArrayList<Integer>();
		for (int i = 0; i < nums.length - 1; i += 2) {
			int times = nums[i];
			int val = nums[i + 1];
			while (times-- > 0)
				l.add(val);
		}

		Integer[] output = l.toArray(new Integer[l.size()]);
		for(int val:output)
			System.out.print(val+" ");
	}

}
