package leetcode;

public class SingleNumberIII {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 1, 3, 2, 5 };
		int[] output = new int[2];
		int xor = nums[0];
		for (int i = 1; i < nums.length; i++)
			xor = xor ^ nums[i];
		int count = 0;
		int ans = xor;
		while (ans != 0) {
			if ((ans & 1) == 1) {
				break;
			}
			count++;
			ans = ans >> 1;
		}
		System.out.println(count);
		int res = 0;
		for (int i = 0; i < nums.length; i++) {
			if ((nums[i] & (1 << count)) == 0)
				res = res ^ nums[i];
		}
		System.out.println(res ^ xor);
		System.out.println(res);
	}

}
