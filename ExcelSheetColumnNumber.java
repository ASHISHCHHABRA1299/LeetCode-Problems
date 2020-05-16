package leetcode;

public class ExcelSheetColumnNumber {

	public static void main(String[] args) {
//		String s = "AJHX";
		String s="ALOHA";
		int totalnumber = 26 - (90 - (int) s.charAt(s.length() - 1));
		int k = 1;
		int m = k;
		int l = 25;
		for (int i = s.length() - 2; i >= 0; i--) {
			m = k * (26 - (90 - (int) s.charAt(i)));
			totalnumber += 26 * m;
			k = k + l;
			l = l * 26;
		}
		System.out.println(totalnumber);
	}

}
