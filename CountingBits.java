package leetcode;

public class CountingBits {

	public static void main(String[] args) {
		int n = 12;
		int[] output = new int[n + 1];
		output[0] = 0;
		output[1] = output[2] = 1;
		for (int i = 3; i <= n; i++) {
			int val = 2;
			int lastval = 0;
			while (val <= i) {
				lastval = val;
				val *= 2;
			}
			output[lastval]=1;
			output[i] = output[lastval] + output[i - lastval];
		}

		for (int v : output)
			System.out.print(v + " ");

	}

}
