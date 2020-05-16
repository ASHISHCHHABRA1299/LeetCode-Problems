package leetcode;

public class ReverseStringII {

	public static void main(String[] args) {
		String s = "abcdefg";
		int k = 2;
		char[] ch = s.toCharArray();
		for (int start = 0; start < ch.length; start += 2 * k) {
			int i = start;
			int j = Math.min(start + k - 1, ch.length - 1);
			while (i < j) {
				char c = ch[i];
				ch[i++] = ch[j];
				ch[j--] = c;
			}
		}
		System.out.println(new String(ch));
	}

}
