package leetcode;

public class StudentAttendanceRecordI {

	public static void main(String[] args) {
		String s = "PPALLP";
		int countl = 1;
		int counta = 0;
		int flag = 0;
		for (int i = 0; i < s.length(); i++) {

			if (i > 0 && s.charAt(i) == 'L' && s.charAt(i - 1) != 'L') {
				countl = 1;
			}
			if (i > 0 && s.charAt(i) == 'L' && s.charAt(i - 1) == 'L') {
				countl++;
			}
			if (s.charAt(i) == 'A') {
				counta++;
			}
			if (countl > 2 || counta > 1) {
				flag = 1;
				break;
			}
		}
		if (flag == 1)
			System.out.println(false);
		else
			System.out.println(true);

	}

}
