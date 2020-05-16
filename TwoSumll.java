package leetcode;

public class TwoSumll {

	public static void main(String[] args) {
		int[] numbers = { 2, 7, 11, 15 };
		int target = 9;
		int[] output = new int[2];
		int i = 0;
		int j = numbers.length - 1;
		while (i < j) {
			if (numbers[i] + numbers[j] == target) {
				output[0] = i+1;
				output[1] = j+1;
				break;
			} else if (numbers[i] + numbers[j] < target) {
				i++;
			} else {
				j--;
			}

		}
		for(int val:output)
			System.out.print(val+" ");

	}

}
