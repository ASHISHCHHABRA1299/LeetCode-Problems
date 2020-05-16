package leetcode;

public class ReverseWordsInAString {

	public static void main(String[] args) {
		String s = " Welcome to Coding blocks";
		StringBuilder sb = new StringBuilder();
		int i, j = s.length() - 1;
		for (i = s.length() - 1; i >= 0; i--) {
			int k;
			if (i == 0 && s.charAt(i) != ' ') {
				k = i;
				while (k <= j) {
					sb.append(s.charAt(k));
					k++;
				}
			}
			if (s.charAt(i) == ' ') {
				k = i + 1;
				while (k <= j) {
					sb.append(s.charAt(k));
					k++;
				}
				j = i - 1;
				if (i > 0 && s.charAt(i - 1) != ' ')
					sb.append(" ");
			}
		}
		System.out.println(sb);

	}

}
