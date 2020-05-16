package leetcode;

import java.util.HashSet;
import java.util.Set;

public class UniqueMorseCodeWords {

	public static void main(String[] args) {
		String[] words = { "gin", "zen", "gig", "msg" };
		Set<String> set = new HashSet<String>();
		String[] code = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--",
				"-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.." };
		for (String word : words) {
			StringBuilder sb = new StringBuilder();
			for (char ch : word.toCharArray()) {
				sb.append(code[ch - 97]);
			}
			set.add(sb.toString());
		}
		System.out.println(set.size());
	}

}
