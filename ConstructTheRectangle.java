package leetcode;

public class ConstructTheRectangle {

	public static void main(String[] args) {
		int area = 8;
		int[] output = new int[2];
		int valuex = 0;
		int valuey = 0;
		int mindiff = Integer.MAX_VALUE;
		for (int i = 1; i * i <= area; i++) {
			if (area % i == 0) {
				int another = area / i;
				if (another >= i) {
					if (another - i < mindiff) {
						mindiff = another - i;
						valuex = another;
						valuey = i;
					}
				}
			}
		}
		output[0] = valuex;
		output[1] = valuey;
		for (int val : output)
			System.out.print(val + " ");

	}

}
