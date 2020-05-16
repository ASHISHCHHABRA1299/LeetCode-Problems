package leetcode;

public class Sqrtx {

	public static void main(String[] args) {
		int n = 15;
		int res = 0;
		for (int i = 1; i * i <= (n / 2) + 1; i++) {
			res = i;
		}
		System.out.println(res);
	}
	/*
	 * if(x<2) return x; int lo=0; int hi=x; double ans=0; while(lo<=hi) { double
	 * mid = lo+(hi-lo)/2; if (mid * mid == x) { return (int)mid; } if (mid * mid <
	 * x) { lo =(int)mid + 1; ans=mid; }else hi = (int)mid - 1;
	 * 
	 * } return (int)ans;
	 */
}
/*
 * for the fractional part take an increment=0.1 and loop to p decimal places
 * times and then check till the time ans*ans<=number and increment the answer by increment part and when
 * the loop fails decrement the value of ans by increment and then divide the
 * inrement by 10 an reduces it till the loop run till p and finally the answer
 * will get return
 */