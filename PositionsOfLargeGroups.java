package leetcode;

import java.util.ArrayList;
import java.util.List;

public class PositionsOfLargeGroups {

	public static void main(String[] args) {
		String s = "abcdddeeeeaabbbcd";
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		int start = 0;
		int end = 0;
		while (start < s.length()) {

			while (end < s.length() && s.charAt(start) == s.charAt(end))
				end++;
			if (end - start >= 3) {
				List<Integer> l = new ArrayList<Integer>();
				l.add(start);
				l.add(end - 1);
				list.add(l);
			}
			start = end;
		}
		System.out.println(list);

	}

}

//a b b x x x x z z y