package leetcode;

public class CountAndSay {

	public static void main(String[] args) {
		System.out.println(countandsay(5));
	}

	public static String countandsay(int n) {
		if (n == 1)
			return "1";
		String ans = countandsay(n - 1);
		String ans1 = "";
		int i = ans.length() - 1;
		ans1 = ans.charAt(ans.length() - 1) + ans1;
		int count = 1;
		while (i > 0) {

			if (ans.charAt(i) == ans.charAt(i - 1))
				count++;
			else {
				ans1 = ans.charAt(i - 1) + "" + count + "" + ans1;
				count = 1;
			}
			i--;
		}
		ans1 = count + "" + ans1;
		return ans1;
	}
}
