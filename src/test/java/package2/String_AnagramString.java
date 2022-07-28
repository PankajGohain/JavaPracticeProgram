package package2;

import java.util.Arrays;

public class String_AnagramString {

	public static void main(String[] args) {

		String s1 = "LISTEN";
		String s2 = "silenta";

		if (s1.length() != s2.length()) {
			System.out.println("No Anagram");
		} else {
			char[] c1 = s1.toLowerCase().toCharArray();
			char[] c2 = s2.toLowerCase().toCharArray();

			Arrays.sort(c1);
			Arrays.sort(c2);

			if (Arrays.equals(c1, c2)) {
				System.out.println("Anagram");
			} else {
				System.out.println("Not Anagram");
			}

		}

	}
}
