package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class ReplaceWords {

	public static void main(String[] args) {
		List<String> dict = new ArrayList<String>(Arrays.asList("cat", "bat", "rat"));
		String sentence = "the cattle was rattled by the battery";
		String[] words = sentence.split(" ");
		int minlength = Integer.MAX_VALUE;
		int maxlength = Integer.MIN_VALUE;
		HashSet<String> set = new HashSet<String>();
		for (int i = 0; i < dict.size(); i++) {
			set.add(dict.get(i));
			minlength = Math.min(minlength, dict.get(i).length());
			maxlength = Math.max(maxlength, dict.get(i).length());
		}
		StringBuilder sb = new StringBuilder();
		for (String word : words) {
			int first = 0;
			if (word.length() == minlength) {
				if (set.contains(word)) {
					sb.append(word);
					sb.append(" ");
					first = 1;
				}

			}

			int flag = 0;
			for (int i = minlength; i <= maxlength; i++) {
				if (first == 0 && word.length() >= i && set.contains(word.substring(0, i))) {
					sb.append(word.substring(0, i));
					sb.append(" ");
					flag = 1;
					break;
				}
			}
			if (first == 0 && flag == 0) {
				sb.append(word);
				sb.append(" ");
			}
		}
		sb.deleteCharAt(sb.length() - 1);

		System.out.println(sb.toString());
	}

}
