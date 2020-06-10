package leetcode;

public class MaximumNumberOfBalloons {

	public static void main(String[] args) {
		String text = "leetcode";
		int[] charcounts = new int[26];
		for (char c : text.toCharArray()) {
			charcounts[c - 'a']++;
		}
		int min = charcounts[1];// b
		min = Math.min(charcounts[0], min); // a
		min = Math.min(charcounts[11] / 2, min);// l
		min = Math.min(charcounts[14], min);//o
		min = Math.min(charcounts[13], min);//n
		System.out.println(min);
	}

}
