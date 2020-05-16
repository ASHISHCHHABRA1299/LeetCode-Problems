package leetcode;

public class MaximumSumCircularSubarray {

	public static void main(String[] args) {
		int[] arr = { -3, -2, -1 };
		int s = 0;
		for (int c : arr)
			s += c;
		int ans1 = kadane(arr);
		for (int i = 0; i < arr.length; i++) {
			arr[i] = -arr[i];
		}
		int ans2 = s + kadane(arr);
		if (ans2 == 0) {
			System.out.println(ans1);
			return;
		}
		System.out.println(Math.max(ans1, ans2));
	}

	private static int kadane(int[] arr) {
		int max = Integer.MIN_VALUE;
		int cs = 0;
		int maxn = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			cs += arr[i];
			if (cs > maxn)
				maxn = cs;
			if (cs < 0)
				cs = 0;
			max = Math.max(cs, max);
		}
		return max == 0 ? maxn : max;
	}
}
