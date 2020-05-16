package leetcode;

public class CellsWithOddValuesInAMatrix {

	public static void main(String[] args) {
		int[][] indices = { { 1, 1 }, { 0, 0 } };
		int n = 2;
		int m = 2;
		int[] row = new int[n];
		int[] col = new int[m];
		for (int[] in : indices) {
			row[in[0]]++;
			col[in[1]]++;
		}
		int count = 0;
		for (int i = 0; i < row.length; i++) {
			for (int j = 0; j < col.length; j++) {
				if ((row[i] + col[j]) % 2 != 0)
					count++;
			}
		}
		System.out.println(count);
	}

}
