package leetcode;

import java.util.HashMap;

public class FindUniqueCharacterInString {

	public static void main(String[] args) {
		String s = "loveleetcode";
//		for (int i = 0; i < s.length(); i++) {
//			if (s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i))) {
//				System.out.println(i);
//				return;
//			}
//
//		}
//		System.out.println(-1);
		HashMap<Character, Integer> count = new HashMap<Character, Integer>();
		int n = s.length();
		// build hash map : character and how often it appears
		for (int i = 0; i < n; i++) {
			char c = s.charAt(i);
			count.put(c, count.getOrDefault(c, 0) + 1);
		}

		// find the index
		for (int i = 0; i < n; i++) {
			if (count.get(s.charAt(i)) == 1)
				System.out.println(i);
			return;
		}
		System.out.println(-1);
	}

}
