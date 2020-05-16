package leetcode;

public class HammingDistance {

	public static void main(String[] args) {

		int x = 1;
		int y = 4;
		int dist = 0;
		while (x > 0 || y > 0) {
			dist += (x & 1) ^ (y & 1);
			x = x >> 1;
			y = y >> 1;
		}
		System.out.println(dist);
	}

}
