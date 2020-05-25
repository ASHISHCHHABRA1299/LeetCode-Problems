package leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestWordInDictionary {

	public static void main(String[] args) {
		String[] words = { "a", "banana", "app", "appl", "ap", "apply", "apple" };
		Arrays.sort(words);
		Set<String> set = new HashSet<String>();
		String res = "";
		for (String word : words) {
			if (word.length() == 1 || set.contains(word.substring(0, word.length() - 1))) {
				if (word.length() > res.length())
					res = word;
				set.add(word);
			}
		}
		System.out.println(res);
	}

}
