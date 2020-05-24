package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReformatTheString {

	public static void main(String[] args) {
		String s = "covid2019";
		List<Character> alp = new ArrayList<Character>();
		List<Character> num = new ArrayList<Character>();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
				alp.add(s.charAt(i));
			} else
				num.add(s.charAt(i));
		}
		if (Math.abs(alp.size() - num.size()) > 1) {
			System.out.println("");
			return;
		}

		if (alp.size() > num.size()) {
			List<Character> temp = alp;
			alp = num;
			num = temp;
		}

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			if (i % 2 == 0) {
                sb.append(num.get(i/2));
			} else {
				sb.append(alp.get(i/2));
			}
		}
		System.out.println(sb.toString());
	}

}
