package leetcode;

public class GoatLatin {

	public static void main(String[] args) {
		String s = "I speak Goat Latin";
		String[] arr = s.split(" ");
		int times = 1;
		StringBuilder sb = new StringBuilder();
		for (String word : arr) {
			char ch = word.charAt(0);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				sb.append(word + "ma");
			} else {
				sb.append(word.substring(1) + word.substring(0, 1) + "ma");
			}
			int i = 0;
			while (i < times) {
				sb.append("a");
				i++;
			}
			times++;
			sb.append(" ");
		}
		System.out.println(sb.toString());

	}

}
