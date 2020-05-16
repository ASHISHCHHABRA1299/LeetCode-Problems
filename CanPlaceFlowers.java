package leetcode;

public class CanPlaceFlowers {

	public static void main(String[] args) {
		int[] flowerbed = { 1, 0, 0, 0, 1, 0, 0 };
		int n = 2;
		int count = 0;
		for (int i = 0; i < flowerbed.length; i++) {
			if (count == n) {
				System.out.println(true);
				return;
			}
			if (flowerbed[i] == 1)
				continue;
			else {
				if (i > 0 && flowerbed[i - 1] == 1)
					continue;
				else if (i < flowerbed.length - 1 && flowerbed[i + 1] == 1)
					continue;
				else {
					flowerbed[i] = 1;
					count++;

				}
			}
		}
		if (count == n)
			System.out.println(true);
		else
			System.out.println(false);

	}

}
