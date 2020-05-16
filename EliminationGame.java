package leetcode;

public class EliminationGame {

	public static void main(String[] args) {
		int n = 9;
		int min = 1;
		int max = n;
		int inc = 1;
		boolean asc = true;
		while (min != max) {
			if (asc) {
				min = min + inc;
				inc *= 2;
				max = min + (max - min) / inc * inc;
			} else {
				max = max - inc;
				inc *= 2;
				min = max - (max - min) / inc * inc;
			}

			asc = !asc;
		}
		System.out.println(min);

		int head = 1;
		int step = 1;
		int remain = n;
		boolean isleft = true;
		while (remain > 1) {
			if (isleft || remain % 2 == 1)
				head += step;

			remain /= 2;
			step *= 2;
			isleft = !isleft;
		}
		System.out.println(head);

	}

}
