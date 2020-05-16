package leetcode;

import java.util.ArrayList;
import java.util.Scanner;

public class GenerateParenthesis {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
//		System.out.println(generate(0, 0, n));
		ArrayList<String> list=new ArrayList<String>();
		generate(0, 0, n, "",list);
		System.out.println(list);
	}

//	public static ArrayList<String> generate(int open, int close, int n) {
//		if (n == 0) {
//			ArrayList<String> br = new ArrayList<String>();
//			br.add("");
//			return br;
//		}
//		
//		return null;
//	}
	public static void generate(int open, int close, int n, String ans,ArrayList<String> list) {
		if (open==n&&close==n) {
			list.add(ans);
			return;
		}
		if (open > n || close > n || close > open) {
			return;
		}
		generate(open + 1, close, n, ans + "(",list);
		generate(open, close + 1, n, ans + ")",list);
	}
}
