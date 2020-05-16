package leetcode;

public class ImplementStrstr {

	public static void main(String[] args) {
		// Return the index of the first occurrence of needle in haystack, or -1 if
		// needle is not part of haystack.
//		Input: haystack = "hello", needle = "ll"
//				Output: 2
		String haystack = "hello";
		String needle = "l";
		int strt = Integer.MAX_VALUE;
		for (int i = 0; i <= haystack.length() - needle.length(); i++) {
			int flag = 0;
			for (int j = 0; j < needle.length(); j++) {
				if (haystack.charAt(i + j) != needle.charAt(j)) {
					flag = 1;
					break;
				}
			}
			if (flag == 0 && i < strt) {
				strt = i;

			}
		}
		if (strt == Integer.MAX_VALUE)
			strt = -1;
		System.out.println(strt);
		/*
		 * no need of flag variable
		 * if(j==n)
		 * return i;
		 * 
		 * 
		 * return -1;
		 */
	}

}
