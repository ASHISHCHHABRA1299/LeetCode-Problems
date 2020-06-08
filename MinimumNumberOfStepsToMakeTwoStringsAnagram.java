package leetcode;

public class MinimumNumberOfStepsToMakeTwoStringsAnagram {

	public static void main(String[] args) {
		String s = "aba";
		String t = "bab";
		int[] sf = new int[128];
		int[] tf = new int[128];
		for (char c : s.toCharArray())
			sf[c]++;
		for (char c : t.toCharArray())
			tf[c]++;
		int count = 0;
		for (int i = 0; i < tf.length; i++) {
			if (sf[i] < tf[i])
				count += Math.abs(sf[i] - tf[i]);

		}
		System.out.println(count);

	}

}
