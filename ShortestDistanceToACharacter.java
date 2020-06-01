package leetcode;

public class ShortestDistanceToACharacter {

	public static void main(String[] args) {
		String s = "loveleetcode";
		char c = 'e';
		int n = s.length();
		int[] ans = new int[n];
		int prev = Integer.MIN_VALUE / 2;
		for (int i = 0; i < n; i++) {
			if (s.charAt(i) == c)
				prev = i;
			ans[i] = i - prev;
		}
		prev = Integer.MAX_VALUE / 2;
		for (int i = n - 1; i >= 0; i--) {
			if (s.charAt(i) == c)
				prev = i;
			ans[i] = Math.min(ans[i], prev - i);
		}
		for (int val : ans)
			System.out.print(val + " ");
	}

}
