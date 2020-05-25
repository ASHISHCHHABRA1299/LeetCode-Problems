package leetcode;

public class CheckIfAWordOccursAsAPrefixOfAnyWordInASentence {

	public static void main(String[] args) {
		String s = "i am tired";
		String search = "you";
		String[] arr = s.split(" ");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].startsWith(search)) {
				System.out.println(i + 1);
				return;
			}
		}
		System.out.println(-1);

	}

}
