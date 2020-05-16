package leetcode;

import java.util.HashMap;

public class BullsAndCows {

	public static void main(String[] args) {
		String secret = "8578605648";
		String guess = "3675352465";
//		HashMap<Character, Integer> map = new HashMap<>();
//		int noofbulls = 0;
//		int noofcows = 0;
//		// count bulls
//		for (int i = 0; i < secret.length(); i++) {
//			if (secret.charAt(i) == guess.charAt(i))
//				noofbulls++;
//			else
//				map.put(secret.charAt(i), map.getOrDefault(secret.charAt(i), 0) + 1);
//		}
//		System.out.println(map);
//		// count cows
//		for (int i = 0; i < secret.length(); i++) {
//			if (secret.charAt(i) != guess.charAt(i)) {
//				if (map.containsKey(guess.charAt(i))) {
//					noofcows++;
//					if (map.get(guess.charAt(i)) == 1) {
//						map.remove(guess.charAt(i));
//					} else {
//						int freq = map.get(guess.charAt(i)) - 1;
//						map.put(guess.charAt(i), freq);
//					}
//				}
//			}
//		}
		int countBull = 0;
		int countCow = 0;
		int[] arr1 = new int[10];
		int[] arr2 = new int[10];

		for (int i = 0; i < secret.length(); i++) {
			char c1 = secret.charAt(i);
			char c2 = guess.charAt(i);

			if (c1 == c2)
				countBull++;
			else {
				arr1[c1 - '0']++;
				arr2[c2 - '0']++;
			}
		}

		for (int i = 0; i < 10; i++) {
			countCow += Math.min(arr1[i], arr2[i]);
		}
//		System.out.println(noofbulls + "A" + noofcows + "B");
		System.out.println(countBull + "A" + countCow + "B");
	}

}
