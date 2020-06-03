package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class SubdomainVisitCount {

	public static void main(String[] args) {
		String[] domains = { "900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org" };
		List<String> l = new ArrayList<String>();
		HashMap<String, Integer> count = new HashMap<String, Integer>();
		for (String d : domains) {
			d = d.replaceAll(" ", ".");
			int index = d.indexOf('.');
			String number = d.substring(0, index);
			for (int i = 0; i < d.length(); i++) {
				if (d.charAt(i) == '.') {
					count.put(d.substring(i + 1), count.getOrDefault(d.substring(i + 1), 0) + Integer.parseInt(number));
				}
			}
		}
		for (String key : count.keySet()) {
			l.add(count.get(key) + " " + key);
		}
		Collections.reverse(l);
		System.out.println(l);
	}

}
