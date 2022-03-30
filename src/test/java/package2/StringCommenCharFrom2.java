package package2;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class StringCommenCharFrom2 {

	public static void main(String[] args) {

		String str1 = "Strong";
		String str2 = "string";

		char arr1[] = str1.toLowerCase().toCharArray();
		char arr2[] = str2.toLowerCase().toCharArray();
		Set<Character> set1 = new LinkedHashSet<>();
		Set<Character> set2 = new LinkedHashSet<>();

		for (Character a : arr1) {
			set1.add(a);
		}

		for (Character a : arr2) {
			set2.add(a);
		}

		set1.retainAll(set2);

		if (set1.size() > 1)
			System.out.println("Common Character" + set1);
		else
			System.out.println("No common character");
	}

}
