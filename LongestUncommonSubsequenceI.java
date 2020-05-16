package leetcode;

public class LongestUncommonSubsequenceI {

	public static void main(String[] args) {
		String a = "aaa";
		String b = "aba";
		if (a.equals(b)) {
			System.out.println(-1);
			return;
		}
		System.out.println(Math.max(a.length(), b.length()));
	}

}
