package leetcode;

public class LengthOfLastWord {

	public static void main(String[] args) {
		String s = "   World ";
		int j = s.length() - 1;
		s = s.trim();
		System.out.println(s);
		int count = 0;
		for (int i = s.length() - 1; i >= 0; i--) {
			if (s.charAt(i) == ' ')
				break;
			count++;
		}
		System.out.println(count);

	}

}
