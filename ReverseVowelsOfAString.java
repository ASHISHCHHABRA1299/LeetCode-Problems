package leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ReverseVowelsOfAString {

	public static void main(String[] args) {
		String s = "leetcode";
		int i = 0;
		int j = s.length() - 1;
		char[] ch = s.toCharArray();
		Set<Character> set = new HashSet<Character>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
		while (i < j) {
			while (i < j && !set.contains(ch[i]))
				i++;
			while (i < j && !set.contains(ch[j]))
				j--;
			char a = ch[i];
			ch[i++] = ch[j];
			ch[j--] = a;
		}
		System.out.println(new String(ch));
	}

}
