package leetcode;

public class PowerOfFour {

	public static void main(String[] args) {
		int n = 218;
		int m = (int) (Math.log10(n) / Math.log10(2));
		if (m % 1 == 0)
			System.out.println(true);
		else
			System.out.println(false);

	}

}
