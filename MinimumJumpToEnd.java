package leetcode;

public class MinimumJumpToEnd {

	public static void main(String[] args) {
		int[] arr = { 2, 3, 1, 1, 2, 4, 2, 0, 1, 1 };
		int[] minjump = new int[arr.length];
		int i = 1;
		while (i < arr.length) {
			int j = 0;
			while (j < i) {
				if (arr[j] >= i - j) {
					if (minjump[i] != 0) {
						minjump[i] = Math.min(minjump[i], minjump[j] + 1);
					} else {
						minjump[i] = minjump[j] + 1;
					}
				}
				j++;
			}
			i++;
		}
		System.out.println(minjump[minjump.length - 1]);
//		for (int val : minjump)
//			System.out.println(val);
	}

}
