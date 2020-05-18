package leetcode;

public class RobotReturnToOrigin {

	public static void main(String[] args) {
		String moves = "LL";
		int x = 0;
		int y = 0;
		for (char c : moves.toCharArray()) {
			if (c == 'U')
				y++;
			if (c == 'D')
				y--;
			if (c == 'L')
				x--;
			if (c == 'R')
				x++;
		}
		if (x == 0 && y == 0)
			System.out.println(true);
		else
			System.out.println(false);

	}

}
