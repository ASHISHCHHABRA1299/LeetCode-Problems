package leetcode;

public class ReplaceElementswithGreatestElementOnRightSide {

	public static void main(String[] args) {
		int[] arr = { 17, 18, 5, 4, 6, 1 };
		int maximum = arr[arr.length - 1];
		for (int i = arr.length - 2; i >= 0; i--) {
			int temp=arr[i];
			arr[i] = Math.max(arr[i + 1], maximum);
			maximum = Math.max(maximum, temp);
		}
		arr[arr.length-1]=-1;
		for(int val:arr)
			System.out.print(val+" ");
	}

}
