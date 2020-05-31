package leetcode;

public class BinaryNumberwithAlternatingBits {

	public static void main(String[] args) {

		int n = 7;
		String bits = Integer.toBinaryString(n);
		for (int i = 0; i < bits.length() - 1; i++) {
			if (bits.charAt(i) == bits.charAt(i + 1)) {
				System.out.println(false);
				return;
			}
		}
		System.out.println(true);

	}

}
