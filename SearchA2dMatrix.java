package leetcode;

public class SearchA2dMatrix {

	public static void main(String[] args) {
		int[][] matrix = { { 1, 4, 7, 11, 15 }, { 2, 5, 8, 12, 19 }, { 3, 6, 9, 16, 22 }, { 10, 13, 14, 17, 24 },
				{ 18, 21, 23, 26, 30 } };
		int target = 13;
		int k = 0;
		for (int i = 0; i < matrix.length; i++) {
			if (matrix[i][0] > target)
				break;
			k = i;
		}
		int flag = 0;
		for (int i = 0; i < matrix[0].length; i++) {
			if (matrix[k][i] == target) {
				flag = 1;
				break;
			}
		}
		if (flag == 1)
			System.out.println(true);
		else
			System.out.println(false);

	}
	/*
	 * search in a 2d matrix 2
	 *  if(matrix==null||matrix.length==0||matrix[0].length==0)
            return false;
        int row=0,col=matrix[0].length-1;
        while(row<matrix.length&&col>=0)
        {
            if(matrix[row][col]==target)
                return true;
            else if(matrix[row][col]>target)
                --col;
            else
                ++row;
        }
            return false;
	 */

}
