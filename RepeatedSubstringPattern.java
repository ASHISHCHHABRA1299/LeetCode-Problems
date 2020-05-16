package leetcode;

public class RepeatedSubstringPattern {

	public static void main(String[] args) {
		String s = "aba";
//		int i = 1;
//		int flag = 0;
//		while (i <= s.length()) {
//			String sub = s.substring(0, i);
//			int j = i;
//			int copy = 1;
//			while (j + i <= s.length() && s.substring(j, j + i).equals(sub)) {
//				j = j + i;
//				copy++;
//			}
//			if (copy > 1 && j == s.length()) {
//				flag = 1;
//				break;
//			}
//			i++;
//		}
//		if (flag == 1)
//			System.out.println(true);
//		else
//			System.out.println(false);
		int flag = 0;
		int len = s.length();
		for (int i = len / 2; i > 0; i--) {
			if (len % i == 0) {
				int numrepeat = len / i;
				String sc = s.substring(0, i);
				StringBuilder sb = new StringBuilder();
				for (int j = 0; j < numrepeat; j++)
					sb.append(sc);
				if (sb.toString().equals(s)) {
					flag = 1;
					break;
				}
			}

		}
		if (flag == 1)
			System.out.println(true);
		else
			System.out.println(false);

	}

}
