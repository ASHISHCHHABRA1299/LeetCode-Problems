package leetcode;

public class NoOf1Bits {

	public static void main(String[] args) {
		int n = 43261596;
		// conversion from decimal to bimary
		int count = 0;
		String s = Integer.toBinaryString(n);
//		for (int i = 0; i < s.length(); i++) {
//			if (s.charAt(i) == '1')
//				count++;
//		}
//		while (n>0) {
//				count+=n&1;
//				n=n>>1;
//		}
//		System.out.println(count);
		System.out.println(s);
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
		System.out.println(s1.toString());
		System.out.println(ans);

	}

}
