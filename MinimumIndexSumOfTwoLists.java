package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MinimumIndexSumOfTwoLists {

	public static void main(String[] args) {
		String[] list1 = { "Shogun", "Tapioca Express", "Burger King", "KFC" };
		String[] list2 = { "Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun" };
//		HashMap<String, Integer> map1 = new HashMap<String, Integer>();
//		for (int i = 0; i < list1.length; i++)
//			map1.put(list1[i], i);
//		List<String> list = new ArrayList<String>();
//		int minsum = Integer.MAX_VALUE;
//		int sum = 0;
//		for (int i = 0; i < list2.length && i <= minsum; i++) {
//			if (map1.containsKey(list2[i])) {
//				sum = i + map1.get(list2[i]);
//				if (sum < minsum) {
//					list.clear();
//					minsum = sum;
//					list.add(list2[i]);
//				} else if (sum == minsum) {
//					list.add(list2[i]);
//				}
//			}
//		}
//		String[] res = list.toArray(new String[list.size()]);
//		for (int i = 0; i < list.size(); i++)
//			res[i] = list.get(i);
		HashMap<Integer, List<String>> map = new HashMap<>();
		for (int i = 0; i < list1.length; i++) {
			for (int j = 0; j < list2.length; j++) {
				if (list1[i].equals(list2[j])) {
					if (!map.containsKey(i + j))
						map.put(i + j, new ArrayList<String>());
					map.get(i + j).add(list1[i]);
				}
			}
		}
		int min_index_sum = Integer.MAX_VALUE;
		for (int key : map.keySet())
			min_index_sum = Math.min(min_index_sum, key);
		String[] res = new String[map.get(min_index_sum).size()];
		res = map.get(min_index_sum).toArray(res);
		for (String val : res)
			System.out.print(val + " ");
	}

}
