package leetcode;

import java.util.HashMap;

public class IsomorphicStrings {

	public static void main(String[] args) {
		String s = "ab";
		String t = "aa";
//		int i = 0;
//		int flag = 0;
//		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
//		HashMap<Character, Integer> map1 = new HashMap<Character, Integer>();
//		while (i < s.length()) {
//			if (map.get(s.charAt(i)) != map1.get(t.charAt(i))) {
//				flag = 1;
//				break;
//			}
//			map.put(s.charAt(i), i + 1);
//			map1.put(t.charAt(i), i	 + 1);
//			i++;
//		}
//		if (flag == 1)
//			System.out.println(false);
//		else
//			System.out.println(true);

		int i = 0;
		int flag = 0;
		HashMap<Character, Character> map1 = new HashMap<>();
		HashMap<Character, Character> map2 = new HashMap<>();
		while (i < s.length()) {
			if (map1.containsKey(s.charAt(i))) {
				if (t.charAt(i) != map1.get(s.charAt(i))) {
					flag = 1;
					break;
				}
			} else {
				if (map2.containsKey(t.charAt(i))) {
					flag = 1;
					break;
				}
			}
			map1.put(s.charAt(i), t.charAt(i));
			map2.put(t.charAt(i), s.charAt(i));
			i++;
		}
		if (flag == 1)
			System.out.println(false);
		else
			System.out.println(true);

	}

}
