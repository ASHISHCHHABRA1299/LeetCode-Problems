package leetcode;

public class ComplexNumberMultiplication {

	public static void main(String[] args) {
		String a = "1+1i";
		String b = "1+1i";
		String x[] = a.split("\\+|i");
		String y[] = b.split("\\+|i");
		int a_real = Integer.parseInt(x[0]);
		int a_img = Integer.parseInt(x[1]);
		int b_real = Integer.parseInt(y[0]);
		int b_img = Integer.parseInt(y[1]);
		System.out.println((a_real * b_real - a_img * b_img) + "+" + (a_real * b_img + a_img * b_real) + "i");

	}

}
