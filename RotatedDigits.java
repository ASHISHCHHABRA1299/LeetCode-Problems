package leetcode;

public class RotatedDigits {

	public static void main(String[] args) {
		int n = 10;
		int count = 0;
		for (int i = 1; i <= n; i++) {
			boolean flag = false;
			String s = String.valueOf(i);
			if (s.indexOf("2") != -1 || s.indexOf("5") != -1 || s.indexOf("6") != -1 || s.indexOf("9") != -1) {
				flag = true;
				count++;
			}
			if (flag&&(s.indexOf("3") != -1 || s.indexOf("4") != -1 || s.indexOf("7") != -1))
				count--;
		}
		System.out.println(count);
	}

}
