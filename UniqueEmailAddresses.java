package leetcode;

import java.util.HashSet;
import java.util.Set;

public class UniqueEmailAddresses {

	public static void main(String[] args) {
		String[] emails = { "test.email+alex@leetcode.com", "test.e.mail+bob.cathy@leetcode.com",
				"testemail+david@lee.tcode.com" };
		Set<String> set = new HashSet<String>();
		for (String email : emails) {
			int index = email.indexOf('@');
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < index; i++) {
				if (email.charAt(i) == '+')
					break;
				if (email.charAt(i) != '.')
					sb.append(email.charAt(i));
			}
			sb.append(email.substring(index));
			set.add(sb.toString());
		}
		System.out.println(set.size());

	}

}
