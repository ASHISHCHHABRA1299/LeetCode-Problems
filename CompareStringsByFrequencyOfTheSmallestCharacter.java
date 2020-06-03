package leetcode;

import java.util.Arrays;

public class CompareStringsByFrequencyOfTheSmallestCharacter {

	public static void main(String[] args) {
		String[] q = { "cbd" };
		String[] w = { "zaaaz" };
		int[] wcount = new int[w.length];
		for (int i = 0; i < w.length; i++) {
			getf(i, w, wcount);
		}
		int index = 0;
		int[] output = new int[q.length];
		for (int i = 0; i < q.length; i++) {
			String word = q[i];
			char[] c = word.toCharArray();
			Arrays.sort(c);
			int fvalue = 1;
			for (int j = 1; j < c.length; j++) {
				if (c[j] != c[0])
					break;
				fvalue++;
			}
			int greater = 0;
			for (int j = 0; j < wcount.length; j++) {
				if (wcount[j] > fvalue)
					greater++;
			}
			output[index] = greater;
			index++;
		}
	}

	private static void getf(int pos, String[] w, int[] wcount) {
		String word = w[pos];
		char[] ch = word.toCharArray();
		Arrays.sort(ch);
		int count = 1;
		for (int i = 1; i < ch.length; i++) {
			if (ch[i] != ch[0])
				break;
			count++;
		}
		wcount[pos] = count;
	}

}
