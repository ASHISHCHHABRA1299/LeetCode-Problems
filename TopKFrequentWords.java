package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

public class TopKFrequentWords {

	class node {
		String s;
		int freq;
	}

	class comp implements Comparator<node> {

		@Override
		public int compare(node o1, node o2) {
			if (o1.freq == o2.freq)
				return o2.s.compareTo(o1.s);
			return o1.freq - o2.freq;
		}
	}

	public static void main(String[] args) {
		String[] words = { "i", "love", "leetcode", "i", "love", "coding"};
		int k = 2;
		TopKFrequentWords top = new TopKFrequentWords();
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		PriorityQueue<node> pq = new PriorityQueue<>(top.new comp());
		for (String word : words)
			map.put(word, map.getOrDefault(word, 0) + 1);
		List<String> l = new ArrayList<String>(map.keySet());
		System.out.println(map);
		for (int i = 0; i < l.size(); i++) {
			node n = top.new node();
			n.s = l.get(i);
			n.freq = map.get(l.get(i));
			pq.offer(n);
			if (pq.size() > k)
				pq.poll();
		}
		List<String> list = new ArrayList<String>();
		while (!pq.isEmpty()) {
			node n = pq.remove();
			list.add(0,n.s);
		}
//		Collections.sort(list);
		System.out.println(list);
	}

}
