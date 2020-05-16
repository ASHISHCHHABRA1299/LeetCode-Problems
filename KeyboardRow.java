package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class KeyboardRow {

	public static void main(String[] args) {
		String[] words = { "Hello", "Alaska", "Dad", "Peace" };
		Set<Character> first = new HashSet<Character>(Arrays.asList('Q', 'q', 'W', 'w', 'E', 'e', 'r', 'R', 'T', 't',
				'Y', 'y', 'U', 'u', 'I', 'i', 'O', 'o', 'P', 'p'));
		Set<Character> second = new HashSet<Character>(Arrays.asList('A', 'a', 'S', 's', 'D', 'd', 'F', 'f', 'G', 'g',
				'H', 'h', 'J', 'j', 'k', 'K', 'l', 'L'));
		Set<Character> third = new HashSet<Character>(
				Arrays.asList('Z', 'z', 'X', 'x', 'C', 'c', 'V', 'v', 'B', 'b', 'N', 'n', 'M', 'm'));
		List<String> list = new ArrayList<String>();
		for (int i = 0; i < words.length; i++) {
			int firsttemp = 0;
			int secondtemp = 0;
			int thirdtemp = 0;
			String s = words[i];
			for (int j = 0; j < s.length(); j++) {
				if (first.contains(s.charAt(j)))
					firsttemp++;
				if (second.contains(s.charAt(j)))
					secondtemp++;
				if (third.contains(s.charAt(j)))
					thirdtemp++;
			}
			if (firsttemp == s.length() || secondtemp == s.length() || thirdtemp == s.length())
				list.add(s);
		}
		String[] output = new String[list.size()];
		for (int i = 0; i < output.length; i++)
			output[i] = list.get(i);

		for (String val : output)
			System.out.print(val + " ");

	}

}
