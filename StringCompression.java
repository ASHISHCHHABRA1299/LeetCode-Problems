package leetcode;

public class StringCompression {

	public static void main(String[] args) {
		char[] ch = { 'a', 'a', 'b', 'b', 'a', 'a' };
//		int place = 0;
//		int count = 1;
//		ch[place] = ch[0];
//		for (int i = 0; i < ch.length - 1; i++) {
//			if (ch[i] != ch[i + 1]) {
//				if (count > 1) {
//					if (count > 9) {
//						ch[++place] = (char) ((count / 10) + '0');
//						ch[++place] = (char) ((count % 10) + '0');
//					} else {
//						ch[place] = (char) (count + '0');
//					}
//					ch[++place] = ch[i+1];
//					count = 1;
//				}
//			} else {
//				count++;
//			}
//		}
//		if (count > 1) {
//			if (count > 9) {
//				ch[++place] = (char) ((count / 10) + '0');
//				ch[++place] = (char) ((count % 10) + '0');
//			} else {
//				ch[place] = (char) (count + '0');
//			}
//		}
//		for (int i = 0; i <= place; i++)
//			System.out.print(ch[i] + " ");
		int index = 0;
		int i = 0;
		while (i < ch.length) {
			int j = i;
			while (j < ch.length && ch[i] == ch[j]) {
				j++;
			}
			ch[index++] = ch[i];
			if (j - i > 1) {
				String count = j - i + "";
				for (char c : count.toCharArray()) {
					ch[index++] = c;
				}
			}
			i = j;
		}
		System.out.println(index);
	}

}
