package leetcode;

public class DistributeCandiesToPeople {

	public static void main(String[] args) {
		int candies = 7;
		int num_people = 4;
		int[] arr = new int[num_people];
		int i = 1;
		while (candies != 0) {

			if (candies < i) {
				arr[(i - 1) % num_people] += candies;
				candies = 0;
				break;
			}
			arr[(i - 1) % num_people] += i;
			candies -= i;
			i++;
		}
		for (int val : arr)
			System.out.print(val + " ");
	}

}
