package leetcode;

public class MaximumScoreAfterSplittingAString {

	public static void main(String[] args) {
		String s = "1111";
		int maxscore = Integer.MIN_VALUE;
		int rightzeroes = 0;
		int rightones = 0;
		int leftzeroes = 0;
		int leftones = 0;
		for (char c : s.toCharArray()) {
			if (c == '0') {
				rightzeroes++;
			} else {
				rightones++;
			}
		}
		for (int i = 0; i < s.length() - 1; i++) {
			if (s.charAt(i) == '0') {
				leftzeroes++;
				rightzeroes--;
			}
			if (s.charAt(i) == '1') {
				leftones++;
				rightones--;
			}
			maxscore = Math.max(maxscore, leftzeroes + rightones);
		}
		System.out.println(maxscore);
	}

}
