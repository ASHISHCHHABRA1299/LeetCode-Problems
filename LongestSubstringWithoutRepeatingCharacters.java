package leetcode;

public class LongestSubstringWithoutRepeatingCharacters {

	public static void main(String[] args) {
		String s = "pwwkew";
		int i = 0;
		int maxcount = Integer.MIN_VALUE;
		while (i < s.length()) {
			int count = 0;
			int[] arr = new int[256];
			for (int j = i; j < s.length(); j++) {

				if (arr[s.charAt(j)] == 1) {
					arr[s.charAt(j)] = 0;
					break;
				}
				if (arr[s.charAt(j)] == 0) {
					arr[s.charAt(j)] = 1;
					count++;
				}
				if (count > maxcount)
					maxcount = count;
			}
			i++;
		}
		System.out.println(maxcount);
	}

}
