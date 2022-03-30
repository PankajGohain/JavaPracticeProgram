package package2;

import java.util.HashSet;
import java.util.Set;

public class StringPangram {

	public static void main(String[] args) {

		String str = "The quick brown fox jumps over the lazy dog";
		str = str.replaceAll("\\s", "");
		char arr[] = str.toLowerCase().toCharArray();

		Set<Character> s = new HashSet<Character>();

		for (Character a : arr) {
			s.add(a);
		}

		System.out.println(s);

		if (s.size() == 26) {
			System.out.println("Pangram");
		} else {
			System.out.println("No Pangram");
		}
	}

}
