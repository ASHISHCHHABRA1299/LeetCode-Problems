package leetcode;

import java.util.HashMap;

public class UncrossedLines {

	public static void main(String[] args) {
		int[] A = { 2, 5, 1, 2, 5 };
		int[] B = { 10, 5, 2, 1, 5, 2 };
//		int[][] dp = new int[A.length + 1][B.length + 1];
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		System.out.println(uncrossed(A, 0, B, 0));
		System.out.println(uncrossedTD(A, 0, B, 0, map));
	}

	private static int uncrossed(int[] A, int i, int[] B, int j) {
		if (i == A.length || j == B.length)
			return 0;
		int count = 0;
		if (A[i] == B[j]) {
			count = 1 + uncrossed(A, i + 1, B, j + 1);
		} else {
			count = Math.max(uncrossed(A, i + 1, B, j), uncrossed(A, i, B, j + 1));
		}
		return count;
	}

	private static int uncrossedTD(int[] A, int i, int[] B, int j, HashMap<String, Integer> map) {
		if (i == A.length || j == B.length)
			return 0;
		String key = i + "a" + j;
		if (map.containsKey(key))
			return map.get(key);
		int count = 0;
		if (A[i] == B[j]) {
			count = 1 + uncrossedTD(A, i + 1, B, j + 1, map);
		} else {
			count = Math.max(uncrossedTD(A, i + 1, B, j, map), uncrossedTD(A, i, B, j + 1, map));
		}
		map.put(key, count);
		return count;
	}

}
