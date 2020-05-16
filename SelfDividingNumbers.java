package leetcode;

import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumbers {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		int left = 1;
		int right = 22;
		for (int i = left; i <= right; i++) {
			int k = i;
			int flag = 0;
			while (k > 0) {
				int rem = k % 10;
				if (rem == 0 || i % rem != 0) {
					flag = 1;
					break;
				}
				k /= 10;
			}
			if (flag == 0)
				list.add(i);
		}
		System.out.println(list);

	}

}
