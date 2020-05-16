package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {

	public static void main(String[] args) {
		String[] strs = { "eat", "tea", "tan", "ate", "nat", "bat" };
		HashMap<String, List<String>> ans = new HashMap<String,List<String>>();
		for (int i = 0; i < strs.length; i++) {
			String s2 = covertarraytostring(strs[i]);
			if (!ans.containsKey(s2))
				ans.put(s2, new ArrayList<String>());
			ans.get(s2).add(strs[i]);
		}
	    List<List<String>> s = new ArrayList(ans.values());
		System.out.println(s);
	}

	public static String covertarraytostring(String s) {
		char[] ch = s.toCharArray();
		Arrays.sort(ch);
		return new String(ch);

	}

}
