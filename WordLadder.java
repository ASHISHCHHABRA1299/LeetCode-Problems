package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class WordLadder {

	public static void main(String[] args) {
		String beginword = "hit";
		String endword = "cog";
		ArrayList<String> wordlist = new ArrayList<String>(Arrays.asList("hot", "dot", "dog", "lot", "log", "cog"));
		Set<String> wordset = new HashSet<String>(wordlist);
		if (!wordset.contains(endword))
			System.out.println(0);
		Queue<String> q = new LinkedList<>();
		q.offer(beginword);
		int level = 0;
		int flag = 0;
		while (!q.isEmpty()) {
			// allow every word at the same level
			for (int k = q.size(); k > 0; k--) {
				String curr_word = q.poll();
				if (curr_word.equals(endword)) {
					flag = 1;
					break;
				}
				for (int i = 0; i < curr_word.length(); i++) {
					char[] curr_array = curr_word.toCharArray();
					for (char ch = 'a'; ch <= 'z'; ++ch) {
						curr_array[i] = ch;
						String s = new String(curr_array);
						if (wordset.contains(s) && !s.equals(curr_word)) {
							q.offer(s);
							wordset.remove(s);
						}
					}
				}
			}

			++level;
		}
		if (flag == 0)
			System.out.println(0);
		else
			System.out.println(level + 1);

	}

}
