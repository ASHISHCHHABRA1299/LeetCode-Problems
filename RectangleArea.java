package leetcode;

public class RectangleArea {

	public static void main(String[] args) {
		int A = -3;
		int B = 0;
		int C = 3;
		int D = 4;
		int E = 0;
		int F = -1;
		int G = 9;
		int H = 2;
		int rect1 = Math.abs(C - A) * Math.abs(D - B);
		int rect2 = Math.abs(G - E) * Math.abs(H - F);
		if (A > G || C < E || D < F || B > H) {
			System.out.println(rect1 + rect2);
			return;
		}
		int top = Math.min(H, D);
		int left = Math.max(A, E);
		int bottom = Math.max(B, F);
		int right = Math.min(C, G);

		System.out.println((rect1 + rect2) - ((right-left) * (top-bottom)));
	}

}
