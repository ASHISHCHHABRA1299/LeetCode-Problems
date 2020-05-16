package leetcode;

import java.util.HashMap;

public class WordPattern {

	public static void main(String[] args) {
		String pattern = "aaaa";
		String str = "dog cat cat dog";
		int length1 = pattern.length();
		int length2 = 1;
		int l = 0;
		while (l < str.length()) {
			if (str.charAt(l) == ' ')
				length2++;
			l++;
		}
		// check the length of both the pattern and string and compare if not matches
		// then return false and if not return true
		HashMap<Character, String> map = new HashMap<Character, String>();
		HashMap<String, Character> map1 = new HashMap<String, Character>();
		int i = 0;
		int j = 0;
		int flag = 0;
		while (i < pattern.length()) {
			int k = j;
			while (k < str.length() && str.charAt(k) != ' ') {
				k++;
			}
			String s = str.substring(j, k);
			if (map.containsKey(pattern.charAt(i))) {
				if (!s.equals(map.get(pattern.charAt(i)))) {
					flag = 1;
					break;
				}
			} else {
				if (map1.containsKey(s)) {
					flag = 1;
					break;
				}
			}
			map.put(pattern.charAt(i), s);
			map1.put(s, pattern.charAt(i));
			j = k + 1;

			i++;
		}
		if (flag == 1)
			System.out.println(false);
		else
			System.out.println(true);
	}

}
