package leetcode;

public class ReverseBits {

	public static void main(String[] args) {
		int n = 43261596;
		String s = Integer.toBinaryString(n);
		StringBuilder sb = new StringBuilder(s);
		StringBuilder s1 = sb.reverse();
		int len = s1.length();
		for (; len < 32; len++) {
			s1.append("0");
		}
		int ans = 0;
		int mul = 1;
		for (int i = s1.length() - 1; i >= 0; i--) {
			if (s1.charAt(i) == '1')
				ans += mul;
			mul *= 2;
		}
		System.out.println(ans);

	}

}
