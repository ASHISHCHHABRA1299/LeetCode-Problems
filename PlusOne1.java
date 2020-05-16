package leetcode;

public class PlusOne1 {

	public static void main(String[] args) {
		int[] digits = { 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };
		int flag = 0;
		for (int i = digits.length - 1; i >= 0; i--) {
			if (digits[i] < 9) {
				digits[i]++;
				flag = 1;
				break;
			}
			digits[i] = 0;
		}
		if (flag == 0) {
			int[] res = new int[digits.length + 1];
			res[0] = 1;
			for (int val : res)
				System.out.print(val + " ");
		} else {
			for (int val : digits)
				System.out.print(val + " ");

		}
	}

}
