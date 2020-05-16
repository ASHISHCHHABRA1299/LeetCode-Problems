package leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BuildAnArrayWithStackOperations {

	public static void main(String[] args) {
		int[] target = { 1, 2 };
		int n = 4;
		Set<Integer> set = new HashSet<Integer>();
		for (int t : target)
			set.add(t);
		List<String> list = new ArrayList<String>();
		for (int i = 1; i <= n; i++) {
			if (i <= target[target.length - 1]) {
				if (set.contains(i)) {
					list.add("Push");
				} else {
					list.add("Push");
					list.add("Pop");
				}
			}
		}
		System.out.println(list);

	}

}
