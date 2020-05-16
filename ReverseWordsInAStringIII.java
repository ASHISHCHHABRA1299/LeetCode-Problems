package leetcode;

public class ReverseWordsInAStringIII {

	public static void main(String[] args) {
		String s = "Let's take LeetCode contest";
		int j = s.length() - 1;
		int i, k;
		StringBuilder sb = new StringBuilder();
		for (i = s.length() - 1; i >= 0; i--) {
			if (i == 0 && s.charAt(i) != ' ') {
				k = i;
				while (k <= j) {
					sb.insert(0, s.charAt(k));
					k++;
				}
			}
			if (s.charAt(i) == ' ') {
				k = i + 1;
				while (k <= j) {
					sb.insert(0, s.charAt(k));
					k++;
				}
				sb.insert(0, ' ');
				j = i - 1;
			}
		}
		System.out.println(sb.toString());

	}

}
