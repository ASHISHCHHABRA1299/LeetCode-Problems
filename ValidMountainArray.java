package leetcode;

public class ValidMountainArray {

	public static void main(String[] args) {
		int[] a = { 0, 3, 2, 1 };
		if (a.length < 3) {
			System.out.println(false);
			return;
		}
//		int[] inc = new int[a.length];
//		int[] dec = new int[a.length];
//		inc[0] = 1;
//		dec[dec.length - 1] = 1;
//		for (int i = 1; i < inc.length; i++) {
//			if (a[i] > a[i - 1])
//				inc[i] = inc[i - 1] + 1;
//			else
//				inc[i] = 1;
//		}
//		for (int j = dec.length - 2; j >= 0; j--) {
//			if (a[j] > a[j + 1])
//				dec[j] = dec[j + 1] + 1;
//			else
//				dec[j] = 1;
//		}
//
//		for (int i = 0; i < a.length; i++) {
//			a[i] = Math.max(inc[i], dec[i]);
//		}
//		int flag = 0;
//		for (int i = 1; i < a.length - 1; i++) {
//			if (a[i] == 1) {
//				flag = 1;
//				break;
//			}
//		}
//		if (flag == 0)
//			System.out.println(true);
//		else
//			System.out.println(false);
		int i = 0;
		int n = a.length;
		while (i + 1 < n && a[i] < a[i + 1])
			i++;
		if (i == 0 || i == n - 1) {
			System.out.println(false);
			return;
		}
		while (i + 1 < n && a[i] > a[i + 1])
			i++;

		if (i == n - 1)
			System.out.println(true);
		else
			System.out.println(false);

	}

}
