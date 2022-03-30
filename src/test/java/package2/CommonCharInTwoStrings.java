package package2;

import java.util.ArrayList;
import java.util.List;

//http://makeseleniumeasy.com/2019/04/08/frequently-asked-java-programs-31-java-program-to-find-common-characters-in-two-given-strings/

public class CommonCharInTwoStrings {

	public static void main(String[] args) {

		String str1 = "selenium";
		String str2 = "winium";

		if (str1.length() > 0 & str2.length() > 0) {

			// Adding each char of string in to a list. If you want distinct chars, you can use set.
			List<Character> s1 = new ArrayList<>();
			List<Character> s2 = new ArrayList<>();

			for (int i = 0; i < str1.length(); i++) {
				s1.add(str1.charAt(i));
			}

			for (int i = 0; i < str2.length(); i++) {
				s2.add(str2.charAt(i));
			}

			// Finding intersection of both lists
			s1.retainAll(s2);

			System.out.println(s1);

			StringBuilder sb = new StringBuilder();

			for (Character c : s1) {
				sb.append(c);
			}

			System.out.println(sb.toString());

		}
	}

}
