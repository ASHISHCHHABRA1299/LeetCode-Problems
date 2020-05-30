package leetcode;

public class FairCandySwap {

	public static void main(String[] args) {
		int[] A = { 1, 2, 5 };
		int[] B = { 2, 4 };
		int suma = 0, sumb = 0;
		int[] output = new int[2];
		for (int a : A)
			suma += a;
		for (int b : B)
			sumb += b;
		int flag = 0;
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < B.length; j++) {
				int val1 = suma - A[i] + B[j];
				int val2 = sumb - B[j] + A[i];
				if (val1 == val2) {
					output[0] = A[i];
					output[1] = B[j];
					flag = 1;
					break;
				}
			}
			if (flag == 1)
				break;
		}
		for (int val : output)
			System.out.print(val + " ");

	}

}
