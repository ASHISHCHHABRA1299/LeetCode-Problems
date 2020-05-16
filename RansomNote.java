package leetcode;

import java.util.HashMap;

public class RansomNote {

	public static void main(String[] args) {
		String ransomNote = "bjaajgea";
		String magazine = "affhiiicabhbdchbidghccijjbfjfhjeddgggbajhidhjchiedhdibgeaecffbbbefiabjdhggihccec";
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < magazine.length(); i++)
			map.put(magazine.charAt(i), map.getOrDefault(magazine.charAt(i), 0) + 1);
		int flag = 0;
		for (int i = 0; i < ransomNote.length(); i++) {
			if (map.containsKey(ransomNote.charAt(i))) {
				if (map.get(ransomNote.charAt(i)) == 1)
					map.remove(ransomNote.charAt(i));
				else {
					int freq = map.get(ransomNote.charAt(i));
					freq--;
					map.put(ransomNote.charAt(i), freq);
				}
			} else {
				flag = 1;
				break;
			}
		}
		if (flag == 1)
			System.out.println(false);
		else
			System.out.println(true);

	}

}
