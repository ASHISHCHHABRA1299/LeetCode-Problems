package leetcode;

public class ConvertaNumbertoHexadecimal {

	public static void main(String[] args) {
		int num =-1;
		StringBuilder sb = new StringBuilder();
		String[] hex = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F" };
		while (num != 0 && sb.length() < 8) {
			sb.insert(0,hex[(num & 15)]);
			num >>= 4;
		}
		System.out.println(sb.toString());
	}

}
