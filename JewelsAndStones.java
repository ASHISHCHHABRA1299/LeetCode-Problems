package leetcode;

import java.util.HashSet;

public class JewelsAndStones {

	public static void main(String[] args) {

		String S = "aA";
		String J = "aAAbbbb";
		HashSet<Character> map = new HashSet<>();
		for (int i = 0; i < J.length(); i++)
			map.add(J.charAt(i));
		int count = 0;
		for (int i = 0; i < S.length(); i++) {
			if (map.contains(S.charAt(i)))
				count++;
		}
		System.out.println(count);
	}

}
