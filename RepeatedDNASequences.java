package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class RepeatedDNASequences {

	public static void main(String[] args) {
		List<String> res = new ArrayList<String>();
		String s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT";
		HashMap<String, Integer> count = new HashMap<String, Integer>();
		for (int i = 10; i <= s.length(); i++) {
			count.put(s.substring(i - 10, i), count.getOrDefault(s.substring(i - 10, i), 0) + 1);
		}
		for (String val : count.keySet()) {
			if (count.get(val) > 1)
				res.add(val);
		}
		System.out.println(res);
	}

}
