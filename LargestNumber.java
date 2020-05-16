package leetcode;

public class LargestNumber {

	public static void main(String[] args) {
//		int[] nums = { 10, 2 };
		int[] nums = { 3, 30, 34, 5, 9 };
		int[] arr = bubblesort(nums);
		if (arr[0] == 0) {
			System.out.println("0");
			return;
		}
		String s = "";
		for (int val : arr)
			s += String.valueOf(val);
		System.out.println(s);

	}

	public static int[] bubblesort(int[] nums) {

		for (int i = 0; i < nums.length - 1; i++) {
			for (int count = 0; count < nums.length - i - 1; count++) {
				if (compare(nums[count], nums[count + 1])) {
					int temp = nums[count];
					nums[count] = nums[count + 1];
					nums[count + 1] = temp;
				}
			}
		}
		return nums;
	}

	public static boolean compare(int a, int b) {
		String ab = a + "" + b;
		String ba = b + "" + a;
		long n1 = Long.parseLong(ab);
		long n2 = Long.parseLong(ba);
		if (n1 < n2)
			return true;
		else
			return false;
	}
	/*
	 * class Solution { private class LargerNumberComparator implements
	 * Comparator<String> {
	 * 
	 * @Override public int compare(String a, String b) { String order1 = a + b;
	 * String order2 = b + a; return order2.compareTo(order1); } }
	 * 
	 * public String largestNumber(int[] nums) { // Get input integers as strings.
	 * String[] asStrs = new String[nums.length]; for (int i = 0; i < nums.length;
	 * i++) { asStrs[i] = String.valueOf(nums[i]); }
	 * 
	 * // Sort strings according to custom comparator. Arrays.sort(asStrs, new
	 * LargerNumberComparator());
	 * 
	 * // If, after being sorted, the largest number is `0`, the entire number // is
	 * zero. if (asStrs[0].equals("0")) { return "0"; }
	 * 
	 * // Build largest number from sorted array. String largestNumberStr = new
	 * String(); for (String numAsStr : asStrs) { largestNumberStr += numAsStr; }
	 * 
	 * return largestNumberStr; } }
	 */
}
