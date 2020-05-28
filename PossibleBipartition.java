package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PossibleBipartition {

	public static void main(String[] args) {
		int N = 4;
		int[][] dislikes = { { 1, 2 }, { 1, 3 }, { 2, 4 } };
		int[] color = new int[N + 1];
		List<Integer>[] graph = new List[N + 1];
		for (int i = 0; i < graph.length; i++)
			graph[i] = new ArrayList<>();
		for (int[] dis : dislikes) {
			graph[dis[0]].add(dis[1]);
			graph[dis[1]].add(dis[0]);
		}
		for (int i = 1; i <= N; i++) {
			if (color[i] == 0) {
				LinkedList<Integer> queue = new LinkedList<Integer>();
				queue.add(i);
				color[i] = 1;
				while (queue.size() != 0) {
					int top = queue.removeFirst();
					for (int val : graph[top]) {
						if (color[top] == color[val]) {
							System.out.println(false);
							return;
						}
						if (color[val] == 0) {
							color[val] = -color[top];
							queue.addLast(val);
						}
					}
				}
			}

		}
		System.out.println(true);
	}

}
