package leetcode;

public class PerfectNumber {

	public static void main(String[] args) {
		int num = 28;
		int sum = 0;
//		for (int i = 1; i <= num / 2; i++) {
//			if (num % i == 0)
//				sum = sum + i;
//		}
//		if(num<=0)
//			return false;
		for (int i = 1; i * i <= num; i++) {
			if (num % i == 0) {
				sum += i;
				if (i * i != num) {
					sum += num / i;
				}
			}
		}
		if (sum - num == num)
			System.out.println(true);
		else
			System.out.println(false);

	}

}
