package leetcode;

import java.util.Arrays;

public class FindWordsThatCanBeFormedbyCharacters {

	public static void main(String[] args) {
		String[] words = { "hello", "world", "leetcode" };
		String chars = "welldonehoneyr";
		int totwordlength = 0;
		int[] charscount = new int[26];
		for (char c : chars.toCharArray())
			charscount[c - 'a']++;
		for (String word : words) {
			int[] temp = Arrays.copyOf(charscount, charscount.length);
			int wordlen = 0;
			for (char ch : word.toCharArray()) {
				if (temp[ch - 'a'] > 0) {
					wordlen++;
					temp[ch - 'a']--;
				}
			}
			if (wordlen == word.length())
				totwordlength += word.length();
		}
		System.out.println(totwordlength);
	}

}
