package leetcode;

public class NumberOfSegmentsInAString {

	public static void main(String[] args) {
		String s = "Hello, my name is John";
		s=s.trim();
		int segment = 0;
//		for (int i = 0; i < s.length(); i++) {
//			if (s.charAt(i) == ' ')
//				segment++;
//		}
		for (int i = 0; i < s.length(); i++) {
			if((i==0||s.charAt(i-1)==' ')&&s.charAt(i)!=' ')
				segment++;
		}
//		System.out.println(segment + 1);
		System.out.println(segment);
	}

}
