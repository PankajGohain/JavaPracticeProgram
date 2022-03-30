package package2;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateChar {

	public static void main(String[] args) {

		String str = "geeksforgeeks";
		String str1 = "geeksforgeeks";

		char arr[] = str.toCharArray();
		Set<Character> charset = new LinkedHashSet<Character>();
		for (Character ch : arr) {

			charset.add(ch);
		}

		System.out.println(charset);
//============================================Method2==============================================
		//https://www.youtube.com/watch?v=W6rCN8Zcikc
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < str1.length(); i++) {
			char ch = str1.charAt(i);
			int idx = str1.indexOf(ch, i + 1); //check for first occurance of the character otherwise return -1
			if (idx == -1) {
				sb.append(ch);
			}
		}
		System.out.println("String after removing duplicate character is" + sb);

	}

}
