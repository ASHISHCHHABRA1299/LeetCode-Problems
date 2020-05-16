package leetcode;

public class DuplicateZeroes {

	public static void main(String[] args) {
		int[] arr = { 1, 0, 2, 3, 0, 4, 5, 0 };
		for (int i = 0; i < arr.length-1; i++) {
			if (arr[i] == 0) {
				for (int j = arr.length - 2; j > i; j--) {
					arr[j + 1] = arr[j];
				}
				arr[i + 1] = 0;
				i++;
			}
		}
		for (int val : arr)
			System.out.print(val + " ");

	}

}
