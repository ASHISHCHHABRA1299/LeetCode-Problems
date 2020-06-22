package leetcode;

public class Maximum69Number {

	public static void main(String[] args) {
		int num = 9669;
		String s = String.valueOf(num);
		StringBuilder sb = new StringBuilder();
		int i;
		for (i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '6') {
				sb.append(9);
				break;
			}
			sb.append(s.charAt(i));
		}
		if (i != s.length())
			sb.append(s.substring(i + 1));
		System.out.println(Integer.parseInt(sb.toString()));

	}

}
