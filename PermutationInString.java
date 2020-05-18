package leetcode;

public class PermutationInString {

	public static void main(String[] args) {
		String s1 = "ab";
		String s2 = "eidbaooo";
		int[] s1f = new int[26];
		int[] s2f = new int[26];
		for (char c : s1.toCharArray())
			s1f[c - 97]++;
//		int n = s1.length();
//		int m = s2.length();
//		for (int i = 0; i <= m - n; i++) {
//			int flag = 0;
//			int[] temp = s1f.clone();
//			String sub = s2.substring(i, i + n);
//			for (char ch : sub.toCharArray())
//				temp[ch - 97]--;
//			for (int j = 0; j < temp.length; j++) {
//				if (temp[j] != 0) {
//					flag = 1;
//					break;
//				}
//			}
//			if (flag == 0) {
//				System.out.println(true);
//				return;
//			}
//		}
//		System.out.println(false);
		for (int i = 0; i < s2.length(); i++) {
			s2f[s2.charAt(i) - 97]++;
			if (i >= s1.length()) {
				s2f[s2.charAt(i - s1.length()) - 97]--;
			}
			if (equal(s1f, s2f)) {
				System.out.println(true);
				return;
			}
		}
		System.out.println(false);

	}

	private static boolean equal(int[] arr1, int[] arr2) {
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] != arr2[i])
				return false;
		}
		return true;
	}

}
