package leetcode;

public class AddStrings {

	public static void main(String[] args) {
		String num1 = "123";
		String num2 = "456";
		int n = num1.length();
		int m = num2.length();
		int i = n - 1;
		int j = m - 1;
//		int len = ((n + m) / 2) + 1;
//		int[] val = new int[len];
//		int k = len - 1;
//		while (i >= 0 || j >= 0) {
//			int value = (num1.charAt(i--) - '0') + (num2.charAt(j--) - '0');
//			int sum = value + val[k - 1];
//			val[k - 1] += sum / 10;
//			val[k] = sum % 10;
//			k--;
//		}
//		String s = "";
//		for (int v : val) {
//			if (v != 0 || s.length() != 0) {
//				s = s + v;
//			}
//		}
//		if (s.length() == 0)
//			System.out.println("0");
//		else
//			System.out.println(s);
//		for(int v : val)
//			System.out.print(v + " ");

		String s = "";
		int carry = 0;
		while (i >= 0 || j >= 0) {

			int value = carry;
			if (i >= 0)
				value += (num1.charAt(i--) - '0');
			if (j >= 0)
				value += (num2.charAt(j--) - '0');
			s = value % 10 + s;
			carry = value / 10;
		}
		if (carry > 0)
			s = carry + s;
		System.out.println(s);
	}

}
