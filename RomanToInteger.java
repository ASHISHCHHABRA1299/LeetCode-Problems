package leetcode;

public class RomanToInteger {

	public static void main(String[] args) {
		String s = "MCMXCIV";
		int sum = 0;
		for (int i = s.length() - 1; i >= 0; i--) {
			if (s.charAt(i) == 'I') {
				if (i != s.length() - 1 && (s.charAt(i + 1) == 'V' || s.charAt(i + 1) == 'X')) {
					sum = sum - 1;
					continue;
				}
				sum = sum + 1;
			}

			if (s.charAt(i) == 'V') {
				sum = sum + 5;
			}
			if (s.charAt(i) == 'X') {
				if (i != s.length() - 1 && (s.charAt(i + 1) == 'L' || s.charAt(i + 1) == 'C')) {
					sum = sum - 10;
					continue;
				}
				sum = sum + 10;
			}
			if (s.charAt(i) == 'L') {
				sum = sum + 50;
			}
			if (s.charAt(i) == 'C') {
				if (i != s.length() - 1 && (s.charAt(i + 1) == 'D' || s.charAt(i + 1) == 'M')) {
					sum = sum - 100;
					continue;
				}
				sum = sum + 100;
			}
			if (s.charAt(i) == 'D') {
				sum = sum + 500;
			}
			if (s.charAt(i) == 'M') {
				sum = sum + 1000;
			}
		}
		System.out.println(sum);

	}

}
