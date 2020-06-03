package leetcode;

public class PeakIndexinAMountainArray {

	public static void main(String[] args) {
		int[] a = { 0,2,1,0};
//		for (int i = 1; i < a.length - 1; i++) {
//			if (a[i] > a[i - 1] && a[i] > a[i + 1]) {
//				System.out.println(i);
//				return;
//			}
//		}
//		System.out.println(-1);
		int lo = 0;
		int hi = a.length - 1;
		while (lo < hi) {
			int mid = lo + (hi - lo) / 2;
			if (a[mid] > a[mid - 1] && a[mid] > a[mid + 1]) {
				System.out.println(mid);
				return;
			}
			if (a[mid] <a[mid + 1])
				lo = mid+1;
			else
				hi = mid ;
		}
		System.out.println(lo);
	}

}
