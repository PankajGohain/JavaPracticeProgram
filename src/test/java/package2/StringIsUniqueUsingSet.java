package package2;

import java.util.HashSet;
import java.util.Set;

public class StringIsUniqueUsingSet {

	public static void main(String[] args) {

		String s = "pankabbj";
		char arr[] = s.toCharArray();

		Set<Character> s1 = new HashSet<Character>();

		for (Character a : arr) {
			s1.add(a);
		}

		if (arr.length == s1.size()) {
			System.out.println("Unique");
		} else {
			System.out.println("not unique");
		}
	}

}
