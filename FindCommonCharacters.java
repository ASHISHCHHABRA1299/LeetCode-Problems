package leetcode;

import java.util.ArrayList;
import java.util.List;

public class FindCommonCharacters {

	public static void main(String[] args) {
		String[] a = { "cool", "lock", "cook" };
		List<String> list = new ArrayList<>();
		int[] freq = new int[26];
		for (String word : a) {
			for (char c : word.toCharArray()) {
				freq[c - 97]++;
			}
		}
		for (int i = 0; i < freq.length; i++) {
			int val = freq[i] / 3;
			while (val > 0) {
				list.add((char) (97 + i) + "");
				val--;
			}
		}
		System.out.println(list);

	}

}
