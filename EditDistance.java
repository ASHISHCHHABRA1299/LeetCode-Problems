package leetcode;

import java.util.Arrays;

public class EditDistance {

	public static void main(String[] args) {
		String word1 = "horse";
		String word2 = "ros";
		int[][] strg = new int[word1.length() + 1][word2.length() + 1];
		for (int[] o : strg) {
			Arrays.fill(o, -1);
		}
		System.out.println(editdistance(word1, word2, strg));
	}

	private static int editdistance(String word1, String word2, int[][] strg) {
		if (word1.length() == 0 || word2.length() == 0)
			return Math.max(word1.length(), word2.length());
		if (strg[word1.length()][word2.length()] != -1)
			return strg[word1.length()][word2.length()];
		String ros1 = word1.substring(1);
		String ros2 = word2.substring(1);
		int ans = 0;
		if (word1.charAt(0) == word2.charAt(0)) {
			ans = editdistance(ros1, ros2, strg);
		} else {
			int i = 1 + editdistance(ros1, word2, strg);
			int d = 1 + editdistance(word1, ros2, strg);
			int r = 1 + editdistance(ros1, ros2, strg);
			ans = Math.min(i, Math.min(d, r));
		}
		return strg[word1.length()][word2.length()] = ans;
	}

}
