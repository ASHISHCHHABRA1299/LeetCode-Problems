package leetcode;

import java.util.HashMap;

public class CheckIfNAndItsDoubleExist {

	public static void main(String[] args) {
		int[] arr = { 7, 1, 14, 11 };
		int flag = 0;
		HashMap<Integer, Boolean> map = new HashMap<Integer, Boolean>();
		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(2 * arr[i]) || map.containsKey(arr[i] / 2) && arr[i] % 2 == 0) {
				flag = 1;
				break;
			}
			map.put(arr[i], true);
		}
		if (flag == 1)
			System.out.println(true);
		else
			System.out.println(false);

	}

}
