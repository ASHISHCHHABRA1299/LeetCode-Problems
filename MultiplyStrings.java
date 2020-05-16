package leetcode;

public class MultiplyStrings {

	public static void main(String[] args) {

		String num1 = "123";
		String num2 = "456";
		int n = num1.length();
		int m = num2.length();
		int[] val = new int[n + m];
		for (int i = n - 1; i >= 0; i--) {
			for (int j = m - 1; j >= 0; j--) {
				int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
				int sum = val[i + j + 1] + mul;
				val[i + j] += sum / 10;
				val[i + j + 1] = sum % 10;
			}
		}

		String s = "";
		for (int v : val) {
			if (v != 0 || s.length() != 0) {
				s = s + v;
			}
		}
		if (s.length() == 0)
			System.out.println("0");
		else
			System.out.println(s);
	}

}
