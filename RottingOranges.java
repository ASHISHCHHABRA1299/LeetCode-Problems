package leetcode;

import java.util.LinkedList;

class cell {
	int x;
	int y;

	cell(int a, int b) {
		this.x = a;
		this.y = b;
	}
}

public class RottingOranges {

	public static void main(String[] args) {
		int[][] grid = { { 2, 1, 1 }, { 0, 1, 1 }, { 1, 0, 1 } };
		int[][] dir = { { 0, 1 }, { 0, -1 }, { 1, 0 }, { -1, 0 } };
		LinkedList<cell> queue = new LinkedList<cell>();
		int fresh = 0;
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				if (grid[i][j] == 2) {
					cell c = new cell(i, j);
					queue.add(c);
				}
				if (grid[i][j] == 1)
					fresh++;
			}
		}
		queue.add(new cell(-1, -1));
		int minutes = 0;
		while (!queue.isEmpty()) {
			cell rc = queue.removeFirst();
			if (rc.x != -1 && rc.y != -1) {
				for (int[] d : dir) {
					int newx = rc.x + d[0];
					int newy = rc.y + d[1];
					if (newx >= 0 && newy >= 0 && newx < grid.length && newy < grid[0].length
							&& grid[newx][newy] == 1) {
						grid[newx][newy] = 2;
						fresh--;
						queue.add(new cell(newx, newy));
					}
				}

			} else {
				if (queue.size() > 0) {
					queue.add(new cell(-1, -1));
					minutes++;

				}
			}
		}

		if (fresh > 0) {
			System.out.println(-1);
			return;
		}
		
		System.out.println(minutes);
	}

}
