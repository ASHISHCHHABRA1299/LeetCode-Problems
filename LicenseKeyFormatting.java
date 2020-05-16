package leetcode;

public class LicenseKeyFormatting {

	public static void main(String[] args) {
		// Hint is in the question is to reformat the string means group the String so
		// this is to take place from the backwards
		String s = "2-5g-3-J";
		int k = 2;
//		int slash = 0;
		int count = 0;
		StringBuilder sb = new StringBuilder();
//		for (int i = 0; i < s.length(); i++) {
//			if (Character.isLetterOrDigit(s.charAt(i)) && slash == 0) {
//				sb.append(Character.toUpperCase(s.charAt(i)));
//			}
//			if (Character.isLetterOrDigit(s.charAt(i)) && slash > 0) {
//				count++;
//				if (count <= k) {
//					sb.append(Character.toUpperCase(s.charAt(i)));
//				} else {
//					count = 0;
//				}
//			}
//
//			if (count == 0 && s.charAt(i) == '-') {
//				sb.append('-');
//			}
//			if (s.charAt(i) == '-') {
//				slash++;
//			}
//		}
		int i = s.length() - 1;
		while (i >= 0) {
			char curr = Character.toUpperCase(s.charAt(i));
			if (curr == '-') {
				i--;
			} else if (count == k) {
				sb.insert(0, '-');
				count = 0;
			} else {
				sb.insert(0, curr);
				count++;
				i--;
			}
		}
		System.out.println(sb.toString());

	}

}
