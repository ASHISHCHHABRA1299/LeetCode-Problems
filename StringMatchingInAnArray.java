package leetcode;

import java.util.ArrayList;
import java.util.List;

public class StringMatchingInAnArray {

	public static void main(String[] args) {
		String[] words = { "mass", "as", "hero", "superhero" };
		List<String> l = new ArrayList<>();
		boolean flag = false;
		for (int i = 0; i < words.length; i++) {
			for (int j = 0; j < words.length; j++) {
				if (words[j].contains(words[i]) && i != j) {
					l.add(words[i]);
					break;
				}
			}
		}
		System.out.println(l);
	}

}
