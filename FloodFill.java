package leetcode;

public class FloodFill {

	public static void main(String[] args) {
		int[][] image = { { 1, 1, 1 }, { 1, 1, 0 }, { 1, 0, 1 } };
		int sr = 1;
		int sc = 1;
		int newcolor = 2;
		int value = image[sr][sc];
		converti(image, sr, sc, newcolor, value);
		for (int[] a : image) {
			for (int val : a) {
				System.out.print(val + " ");
			}
			System.out.println();
		}
	}

	private static void converti(int[][] image, int nr, int nc, int newcolor, int value) {

		if (nr < 0 || nc < 0 || nr > image.length - 1 || nc > image[0].length - 1 || image[nr][nc] != value
				|| image[nr][nc] == newcolor)
			return;

		image[nr][nc] = newcolor;
		// up
		converti(image, nr - 1, nc, newcolor, value);
		// left
		converti(image, nr, nc - 1, newcolor, value);
		// bottom
		converti(image, nr + 1, nc, newcolor, value);
		// right
		converti(image, nr, nc + 1, newcolor, value);

	}

}
