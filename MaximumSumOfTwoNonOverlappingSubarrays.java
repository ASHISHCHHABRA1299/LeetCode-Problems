package leetcode;

public class MaximumSumOfTwoNonOverlappingSubarrays {

	public static void main(String[] args) {
		int[] a = {4,0,1};
		int n = a.length;
		int l = 1;
		int m = 2;
		for (int i = 1; i < a.length; i++)
			a[i] += a[i - 1];
		int lmax = a[l - 1], mmax = a[m - 1];
		int max1 = 0, max2 = 0;
		// l before m
		for (int i = l; i <= n - m; i++) {
			int msum = a[i + m - 1] - a[i - 1];
            max1=Math.max(max1, msum+lmax);
            lmax=Math.max(lmax,a[i]-a[i-l]);
		}
		// m before l
		for (int i = m; i <= n - l; i++) {
			int lsum = a[i + l - 1] - a[i - 1];
            max2=Math.max(max2, lsum+mmax);
            mmax=Math.max(mmax,a[i]-a[i-m]);
		}
		System.out.println(Math.max(max1, max2));
	}

}
