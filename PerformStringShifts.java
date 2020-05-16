package leetcode;

public class PerformStringShifts {

	public static void main(String[] args) {
//		String s = "abc";
		String s = "abcdefg";
		// Another approach is to count the left and right shift and do the maximum one.
		// You may notice that left shift cancels the right shift, so count the total
		// left shift times (may be negative if the final result is right shift), and
		// perform it once.
		int[][] shift = { { 1, 1 }, { 1, 1 }, { 0, 2 }, { 1, 3 } };
		char[] ans = s.toCharArray();
		for (int i = 0; i < shift.length; i++) {
			if (shift[i][0] == 0) {
				int index = shift[i][1];
				while (index-- > 0) {
					char ch = ans[0];
					for (int j = 1; j < ans.length; j++) {
						ans[j - 1] = ans[j];
					}
					ans[ans.length - 1] = ch;
				}
			} else {
				int index = shift[i][1];
				while (index-- > 0) {
					char ch = ans[ans.length - 1];
					for (int j = ans.length - 2; j >= 0; j--) {
						ans[j + 1] = ans[j];
					}
					ans[0] = ch;
				}

			}
		}
		System.out.println(new String(ans));
	}

}
