package leetcode;

public class BitwiseANDOfNumbersRange {

	public static void main(String[] args) {
		int m = 10;
		int n = 15;
		int count = 0;
		while (m != n) {
			count++;
			m = m >> 1;
			n = n >> 1;
		}
		m = m << count;
		System.out.println(m);

	}

}
