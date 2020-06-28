package leetcode;

public class FourDivisors {

	public static void main(String[] args) {
		int[] nums = { 21, 4, 7 };
		int finalans = 0;
		for (int num : nums) {
			int sum = num + 1;
			int count = 2;
			for (int i = 2; i * i <= num; i++) {
				if (num % i == 0 && (num / i) != i) {
					sum = sum + i + (num / i);
					count += 2;
				}
				if (num % i == 0 && (num / i) == i) {
					sum += i;
					count++;
				}
			}
			if (count == 4)
				finalans += sum;
		}
		System.out.println(finalans);
	}

}
