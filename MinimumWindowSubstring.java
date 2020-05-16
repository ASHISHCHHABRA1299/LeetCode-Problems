package leetcode;

import java.util.HashMap;

public class MinimumWindowSubstring {

	public static void main(String[] args) {
		String s = "ADOBECODEBANC";
		String t = "ABC";
		System.out.println(mws(s, t));
	}

	private static String mws(String s, String t) {
		if (s.length() == 0 || t.length() == 0)
			return "";
		HashMap<Character, Integer> t_string = new HashMap<Character, Integer>();
		for (int i = 0; i < t.length(); i++) {
			int count = t_string.getOrDefault(t.charAt(i), 0) + 1;
			t_string.put(t.charAt(i), count);
		}
		int required = t_string.size();
		int formed = 0;
		int l = 0, r = 0;
		int[] ans = { -1, 0, 0 };
		HashMap<Character, Integer> window = new HashMap<Character, Integer>();
		while (r < s.length()) {
			char c = s.charAt(r);
			window.put(c, window.getOrDefault(c, 0) + 1);
			if (t_string.containsKey(c) && t_string.get(c).intValue() == window.get(c).intValue()) {
				formed++;
			}
			while (l <= r && formed == required) {
				c = s.charAt(l);
				if (ans[0] == -1 || ans[0] > r - l + 1) {
					ans[0] = r - l + 1;
					ans[1] = l;
					ans[2] = r;
				}

				window.put(c, window.get(c) - 1);
				if (t_string.containsKey(c) && window.get(c).intValue() < t_string.get(c).intValue())
					formed--;

				l++;
			}

			r++;
		}
		return ans[0] == -1 ? "" : s.substring(ans[1], ans[2] + 1);
	}

}
