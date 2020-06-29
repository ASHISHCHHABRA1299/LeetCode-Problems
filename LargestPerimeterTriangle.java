package leetcode;

import java.util.Arrays;

public class LargestPerimeterTriangle {

	public static void main(String[] args) {
		int[] a = { 1,2,1 };
		Arrays.sort(a);
		for (int i = a.length - 1; i > 1; i--) {
			for (int j = i - 1; j > 0; j--) {
				if (a[j] + a[j - 1] > a[i]) {
					System.out.println(a[i] + a[j] + a[j - 1]);
					return;
				}
			}
		}
		System.out.println(0);

	}

}
