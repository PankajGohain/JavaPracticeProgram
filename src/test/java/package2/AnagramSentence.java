package package2;

import java.util.Arrays;

//An anagram is a word or phrase that's formed by rearranging the letters of another word or phrase.

public class AnagramSentence {

	public static void main(String[] args) {

		String s1 = "Mother In Law";
		String s2 = "Hitler Woman";

		s1 = s1.replaceAll("\\s", "");
		s2 = s2.replaceAll("\\s", "");

		char[] c1 = s1.toLowerCase().toCharArray();
		char[] c2 = s2.toLowerCase().toCharArray();

		Arrays.sort(c1);
		Arrays.sort(c2);

		if (Arrays.equals(c1, c2)) {
			System.out.println("Anagram");
		} else {
			System.out.println("No Anagram");
		}
	}

}
