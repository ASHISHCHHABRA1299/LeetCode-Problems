package leetcode;

import java.util.ArrayList;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		String[] strs = { "dog", "racecar", "car" };
		String str = strs[0];
		String ans = "";
		ArrayList<String> list = new ArrayList<String>();
		for (int j = 1; j <= str.length(); j++) {
			list.add(str.substring(0, j));
		}
		for (String sub : list) {
			int flag = 0;
			for (int i = 1; i < strs.length; i++) {
				if (strs[i].startsWith(sub)) {
					flag = flag + 1;
				} else {
					break;
				}
			}
			if (flag == strs.length - 1)
				ans = sub;

		}
		System.out.println(ans);
		
	}

}
