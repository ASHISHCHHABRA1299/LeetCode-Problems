package leetcode;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;

public class TopKFrequentElements {

	class freqcomparator implements Comparator<node> {

		@Override
		public int compare(node o1, node o2) {
			return o1.freq - o2.freq;
		}

	}

	class node {
		int data;
		int freq;
	}

	public static void main(String[] args) {
		int[] nums = { 1, 1, 1, 2, 2,2,3,3,3 };
//		int[] nums = { 1 };
//		int[] nums = { 4, 1, -1, 2, -1, 2, 3 };
		int k = 3;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			int val = map.getOrDefault(nums[i], 0) + 1;
			map.put(nums[i], val);
		}
		System.out.println(map);
		TopKFrequentElements m = new TopKFrequentElements();
		ArrayList<node> list = new ArrayList<node>();
		ArrayList<Integer> list1 = new ArrayList<Integer>(map.keySet());
		for (int i = 0; i < list1.size(); i++) {
			node n = m.new node();
			n.data = list1.get(i);
			n.freq = map.get(list1.get(i));
			list.add(n);
		}
//		for (int i = 0; i < list.size(); i++) {
//			System.out.print(list.get(i).data + " " + list.get(i).freq);
//			System.out.println();
//		}
		PriorityQueue<node> pq = new PriorityQueue<>(k, m.new freqcomparator());
		for (int i = 0; i < list.size(); i++) {
			if (i < k) {
				pq.add(list.get(i));
			} else {
				if (pq.peek().freq < list.get(i).freq) {
					pq.poll();
					pq.add(list.get(i));
				}
			}
		}
		List<Integer> newlist = new ArrayList<Integer>();
		Iterator<node> i=pq.iterator();
		while(i.hasNext())
		{
			newlist.add(pq.remove().data);
		}
		System.out.println(newlist);
	}

}
