package leetcode;

public class LongestPalindrome {

	public static void main(String[] args) {
		String s = "abccccdd";
		int ans = 0;
		int[] count = new int[128];
		for (int c : s.toCharArray())
			count[c]++;

		for (int v : count) {
			ans += v / 2 * 2;
			if (ans % 2 == 0 && v % 2 == 1)
				ans++;
		}
		System.out.println(ans);

	}

}
