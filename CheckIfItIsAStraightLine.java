package leetcode;

public class CheckIfItIsAStraightLine {

	public static void main(String[] args) {
		int[][] coordinates = { { 1, 2 }, { 2, 3 }, { 3, 4 }, { 4, 5 }, { 5, 6 }, { 6, 7 } };
		int flag = 0;
		int x0 = coordinates[0][0];
		int x1 = coordinates[1][0];
		int y0 = coordinates[0][1];
		int y1 = coordinates[1][1];
		for (int i = 2; i < coordinates.length; i++) {
			int y = coordinates[i][1];
			int x = coordinates[i][0];
			if ((y1 - y0) * (x - x0) != (y - y0) * (x1 - x0)) {
				flag = 1;
				break;
			}
		}
		if (flag == 0)
			System.out.println(true);
		else
			System.out.println(false);

	}

}
//y=ax+b
//b=x2y1-x1y2/x2-x1
