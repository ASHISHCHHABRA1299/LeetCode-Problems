package leetcode;

import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;

class pair {
	char var;
	int freq;

	pair(char v, int f) {
		this.var = v;
		this.freq = f;
	}
}

class comp implements Comparator<pair> {

	@Override
	public int compare(pair o1, pair o2) {
		return o2.freq - o1.freq;
	}

}

class frequency {
	public String frequencySort(String s) {
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (char ch : s.toCharArray())
			map.put(ch, map.getOrDefault(ch, 0) + 1);
		PriorityQueue<pair> pq = new PriorityQueue<pair>(map.size(), new comp());
		for (char ch : map.keySet()) {
			pair np = new pair(ch, map.get(ch));
			pq.add(np);
		}
		StringBuilder sb = new StringBuilder();
		while (!pq.isEmpty()) {
			pair rp = pq.remove();
			char nc = rp.var;
			int nf = rp.freq;
			while (nf-- > 0) {
				sb.append(nc);
			}
		}
		return sb.toString();

	}
}

public class SortCharactersByFrequency {

	public static void main(String[] args) {
		frequency f = new frequency();
		System.out.println(f.frequencySort("cccaaa"));
	}

}
