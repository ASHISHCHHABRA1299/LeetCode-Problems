package leetcode;

public class RotateString {

	public static void main(String[] args) {
		String A = "bbbacddceeb";
		String B = "ceebbbbacdd";
		String original = A;
		String convert = A.substring(1) + A.substring(0, 1);
		if (B.equals(convert)) {
			System.out.println(true);
			return;
		}
		while (!convert.equals(original)) {
			if (B.equals(convert)) {
				System.out.println(true);
				return;
			}
			convert = convert.substring(1) + convert.substring(0, 1);
		}

		System.out.println(false);

	}

}
