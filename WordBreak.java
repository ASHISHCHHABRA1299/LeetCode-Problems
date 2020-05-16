package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class WordBreak {

	public static void main(String[] args) {
		String s = "aaaaaaa";
		ArrayList<String> wordDict = new ArrayList<String>();
		wordDict.add("aaaa");
		wordDict.add("aaa");
		Set<String> set = new HashSet<String>(wordDict);
		System.out.println(wordbreak(s, set));
		System.out.println(wordbreakTD(s, set, new HashMap<String, Boolean>()));
		System.out.println(wordbreakBU(s, set));
        
//		HashMap<String, Integer> map = new HashMap<String, Integer>();
//		for (int i = 0; i < wordDict.size(); i++) {
//			map.put(wordDict.get(i), 0);
//		}
//		boolean var = false;
//		int i = 0;
//		int j = 1;
//		while (j <= s.length()) {
//			if (map.containsKey(s.substring(i, j))) {
//				if (map.get(s.substring(i, j)) == 1) {
//					map.put(s.substring(i, j), 0);
//				} else {
//					map.put(s.substring(i, j), 1);
//					i = j;
//					var = true;
//				}
//
//			} else {
//				var = false;
//			}
//			j++;
//		}
//		System.out.println(var);

	}

	public static boolean wordbreak(String s, Set<String> set) {
		if (s.length() == 0)
			return true;
		boolean ans = false;
		for (int i = 1; i <= s.length(); i++) {
			String part = s.substring(0, i);
			String ros = s.substring(i);
			ans = wordbreak(ros, set);
			if (set.contains(part))
				return true;
		}
		return ans;
	}

	public static boolean wordbreakTD(String s, Set<String> set, HashMap<String, Boolean> map) {
		if (s.length() == 0)
			return true;
		if (map.containsKey(s))
			return map.get(s);
		for (int i = 1; i <= s.length(); i++) {
			String part = s.substring(0, i);
			String ros = s.substring(i);
			if (set.contains(part) && wordbreakTD(ros, set, map)) {
				map.put(ros, true);
				return true;
			}
		}
		map.put(s, false);
		return false;
	}

	public static boolean wordbreakBU(String s, Set<String> set) {
		boolean[] ans = new boolean[s.length() + 1];
		ans[0] = true;
		for (int i = 1; i <= s.length(); i++) {
			for (int j = 0; j < i; j++) {
				if (ans[j] && set.contains(s.substring(j, i))) {
					ans[i] = true;
					break;
				}
			}
		}
		return ans[s.length()];
	}
}
