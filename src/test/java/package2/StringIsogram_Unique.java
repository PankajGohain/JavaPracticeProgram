package package2;

import java.util.HashSet;
import java.util.Set;

public class StringIsogram_Unique {

	public static void main(String[] args) {

		String str = "pankajkumargohain"; //pen
		boolean checkIsogram = true;

		char arr[] = str.toCharArray();

		Set<Character> cset = new HashSet<Character>();

		for (char c : arr) {
			if (cset.contains(c)) {
				checkIsogram = false;
			} else {
				cset.add(c);
			}

		}

		if (checkIsogram) {
			System.out.println("String is Isogram or Unique");
		} else {
			System.out.println("String is not Isogram or Unique");
		}

	}

}
