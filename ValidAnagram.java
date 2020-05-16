package leetcode;

import java.util.Arrays;

public class ValidAnagram {

	public static void main(String[] args) {
		//can be done by sorting the array of characters and check whether both are equal or not
		//array of size of 256
		//hashmap
		String s = "a";
		String t = "ab";
		int[] arr = new int[256];
		Arrays.fill(arr, 0);
		/*
		 * if(s.length()!=t.length()) return false;
		 */
		for (int i = 0; i < s.length(); i++) {
			arr[s.charAt(i)] += 1;
		}
		for (int i = 0; i < t.length(); i++) {
			arr[t.charAt(i)] -= 1;
		}
		int flag = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0 || arr[i] >= 1) {
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
