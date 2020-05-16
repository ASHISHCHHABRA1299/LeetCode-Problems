package leetcode;

import java.util.ArrayList;
import java.util.List;

public class RestoreIpAddresses {

	public static void main(String[] args) {
		String s = "25525511135";
		int n = s.length();
		List<String> list = new ArrayList<String>();
		for (int i = 1; i < n && i < 4; i++) {
			String first = s.substring(0, i);
			if (!isvalid(first))
				continue;
			for (int j = 1; i + j < n && j < 4; j++) {
				String second = s.substring(i, i + j);
				if (!isvalid(second))
					continue;
				for (int k = 1; i + j + k < n && k < 4; k++) {
					String third = s.substring(i + j, i + j + k);
					String fourth = s.substring(i + j + k);
					if (!isvalid(third) || !isvalid(fourth))
						continue;
					list.add(first + "." + second + "." + third + "." + fourth);
				}
			}
		}
		System.out.println(list);
	}

	private static boolean isvalid(String s) {
		if (s.length() > 3)
			return false;
		if (s.startsWith("0") && s.length() > 1)
			return false;
		int val = Integer.parseInt(s);
		return val >= 0 && val <= 255;
	}

}
