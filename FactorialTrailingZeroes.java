package leetcode;

public class FactorialTrailingZeroes {

	public static void main(String[] args) {
		int n = 1808548329;
//		int count = 0;
//		for (int i = 5; n / i >= 1; i = i * 5) {
//			count += n / i;
//		}
//		System.out.println(count);
		int count=0;
		while(n>=5)
		{
			count+=Math.floor(n/5);
			n=(int) Math.floor(n/5);
		}
		System.out.println(count);
	}
}
