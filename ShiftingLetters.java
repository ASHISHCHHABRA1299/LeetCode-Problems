package leetcode;

public class ShiftingLetters {

	public static void main(String[] args) {
		String s = "abc";
		int[] shifts = { 3, 5, 9 };
		int X = 0;
		for (int shift : shifts)
			X = (X + shift) % 26;
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			int index = s.charAt(i) - 'a';
			sb.append((char) ((index + X) % 26 + 97));
			X = Math.floorMod(X - shifts[i], 26);
		}
		System.out.println(sb.toString());

	}

}
