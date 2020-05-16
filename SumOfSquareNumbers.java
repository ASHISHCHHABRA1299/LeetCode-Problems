package leetcode;

public class SumOfSquareNumbers {

	public static void main(String[] args) {
		int c = 100;
		int flag = 0;
		int lo = 0;
		int hi = c;
		while (lo <= hi) {
			if (lo * lo + hi * hi == c) {
				System.out.println(lo + " " + hi);
				flag = 1;
				break;
			} else if (lo * lo + hi * hi > c)
				hi--;
			else
				lo++;
		}
		if (flag == 1)
			System.out.println(true);
		else
			System.out.println(false);

	}

}
