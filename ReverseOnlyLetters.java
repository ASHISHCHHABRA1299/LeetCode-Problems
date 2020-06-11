package leetcode;

public class ReverseOnlyLetters {

	public static void main(String[] args) {
		String s = "a-bC-dEf-ghIj";
		StringBuilder sb = new StringBuilder();
		int i = 0, j = s.length() - 1;
		while (i < s.length()) {
			if (!Character.isLetter(s.charAt(i))) {
				sb.append(s.charAt(i++));
				continue;
			}
			if (!Character.isLetter(s.charAt(j))) {
				j--;
				continue;
			}
			if (Character.isLetter(s.charAt(j))) {
				sb.append(s.charAt(j--));
				i++;
			}
		}
		System.out.println(sb.toString());

	}

}
