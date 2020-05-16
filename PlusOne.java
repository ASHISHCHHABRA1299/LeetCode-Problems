package leetcode;

import java.util.ArrayList;

public class PlusOne {

	public static void main(String[] args) {
		int[] digits = { 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };
		int[] add = { 1 };
		ArrayList<Integer> list = new ArrayList<Integer>();
		int carry = 0;
		int i = digits.length - 1;
		int j = add.length - 1;
		while (i >= 0 || j >= 0) {
			int sum = carry;
			if (i >= 0)
				sum += digits[i];
			if (j >= 0)
				sum += add[j];

			int rem = sum % 10;
			list.add(0, rem);
			carry = sum / 10;
			i--;
			j--;
		}
		if (carry > 0)
			list.add(0, carry);

		digits = new int[list.size()];
		for (int k = 0; k < list.size(); k++) {
			digits[k] = list.get(k);
		}
		for (int val : digits)
			System.out.print(val + " ");
	}

}
