package leetcode;

public class One_bitAndTwo_bitCharacters {

	public static void main(String[] args) {
		int[] bits = { 1, 1, 1, 0 };
		int i = 0;
		while (i < bits.length - 1) {
			i += bits[i] + 1;
		}
		if (i == bits.length - 1)
			System.out.println(true);
		else
			System.out.println(false);

	}

}
