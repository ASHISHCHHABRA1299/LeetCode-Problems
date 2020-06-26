package leetcode;

import java.util.HashMap;

public class CustomSortString {

	public static void main(String[] args) {
		String s = "kqep";
		String t = "pekeq";
		StringBuilder sb = new StringBuilder();
//		StringBuilder sb1 = new StringBuilder(t);
//		for (char ch : s.toCharArray()) {
//			int index=sb1.indexOf(ch+"");
//            while(index!=-1)
//            {
//                sb.append(ch);
//				sb1.deleteCharAt(index);
//                index=sb1.indexOf(ch+"");
//            }
//		}
//		sb.append(sb1);
//		System.out.println(sb.toString());
		HashMap<Character, Integer> count = new HashMap<Character, Integer>();
		for (char ch : t.toCharArray())
			count.put(ch, count.getOrDefault(ch, 0) + 1);
		for (char c : s.toCharArray()) {
			if (count.containsKey(c)) {
				int val = count.get(c);
				while (val-- > 0) {
					sb.append(c);
				}
				count.remove(c);
			}
		}
		for(char c:count.keySet())
		{
			int val=count.get(c);
			while (val-- > 0) {
				sb.append(c);
			}
		}
		System.out.println(sb.toString());
	}

}
