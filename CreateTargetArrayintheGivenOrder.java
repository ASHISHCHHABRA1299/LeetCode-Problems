package leetcode;

import java.util.ArrayList;
import java.util.List;

public class CreateTargetArrayintheGivenOrder {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4, 0 };
		int[] index = { 0, 1, 2, 3, 0 };
		ArrayList<Integer> list = new ArrayList<Integer>();
		int i = 0;
		while (i < index.length) {
			list.add(index[i], nums[i]);
			i++;
		}
		int[] output = new int[nums.length];
		for (int j = 0; j < list.size(); j++)
			output[j] = list.get(j);

		for (int val : output)
			System.out.print(val + " ");

	}

}
