package Package1;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class FirstRepeatedNonRepeatedCharacterInString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = sc.nextLine();
		
		System.out.println("Enter the character to get count");
		char countChar = sc.next().charAt(0);
		
		char ch[] = str.toCharArray();
		Map<Character, Integer> map = new LinkedHashMap<>();

		for (int i = 0; i < ch.length; i++) {
			if (map.containsKey(ch[i])) {
				int count = map.get(ch[i]);
				map.put(ch[i], ++count);
			} else {
				map.put(ch[i], 1);
			}
		}

		Set<Character> set = map.keySet();

		System.out.println("LinkedList table");
		for (Character ch1 : set) {
			if (map.get(ch1) >= 0) {
				System.out.println(ch1 + " : " + map.get(ch1));
			}
		}

		for (Character ch1 : set) {
			if (ch1 == countChar) {
				System.out.println("Count of the character is: " + ch1 + " : " + map.get(ch1));
			}
		}

		for (Character ch1 : set) {
			if (map.get(ch1) == 1) {
				System.out.println("First non-repeated character in string is: " + ch1);
				break;
			}
		}

		for (Character ch1 : set) {
			if (map.get(ch1) > 1) {
				System.out.println("First Repeated character in string is: " + ch1);
				break;
			}
		}

		System.out.println("Duplicate Character & count are");
		for (Character ch1 : set) {
			if (map.get(ch1) >= 2) {
				System.out.println(ch1 + " : " + map.get(ch1));
			}
		}

	}

}
