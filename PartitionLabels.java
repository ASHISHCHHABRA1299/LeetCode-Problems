package leetcode;

import java.util.ArrayList;
import java.util.List;

public class PartitionLabels {

	public static void main(String[] args) {
		String s = "abaccbdeffed";
		int left = 0;
		int rightlast = 0;
		List<Integer> l = new ArrayList<Integer>();
		while (left < s.length()) {
			char ch = s.charAt(left);
			rightlast = s.lastIndexOf(ch);
			int mov = left;
			while (mov <= rightlast) {
				char c = s.charAt(mov);
				if (s.lastIndexOf(c) > rightlast)
					rightlast = s.lastIndexOf(c);
				mov++;
			}
			l.add(rightlast - left + 1);
			left = mov;
		}
		System.out.println(l);
	}

}
