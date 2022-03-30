package package2;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class removeDuplicateCharFrom2Strings {

	public static void main(String[] args) {
		String s1 = "pankajkumargohain";
		String s2 = "mohitesh";

		String s3 = s1.concat(s2);
		char[] arr = s3.toCharArray();

		Set<Character> set = new LinkedHashSet<Character>();

		for (Character carr : arr) {
			set.add(carr);

		}
		System.out.println(set.toString());
	}

}
