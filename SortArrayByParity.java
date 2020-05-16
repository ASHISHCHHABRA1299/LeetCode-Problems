package leetcode;

public class SortArrayByParity {

	public static void main(String[] args) {
		int[] a = { 3, 1, 2, 4 };
		int i = 0;
		int j = a.length - 1;
		while (i < j) {
			if (a[i] % 2 == 1 && a[j] % 2 == 0) {
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				i++;
				j--;
			} else if (a[j] % 2 == 1) {
				j--;
			} else
				i++;
			
		}
		for(int val:a)
			System.out.print(val+" ");

	}

}
