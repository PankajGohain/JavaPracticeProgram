package Package1;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class OcurrenceOfEachCharacter {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = sc.nextLine();
		char ch[] = str.toCharArray();

		// Map<Character, Integer> map = new HashMap<>();
		// or
		Map<Character, Integer> map = new LinkedHashMap<>();
		for (int i = 0; i < ch.length; i++) {

			if (map.containsKey(ch[i])) {
				int count = map.get(ch[i]);
				map.put(ch[i], ++count);
			} else {
				map.put(ch[i], 1);
			}
		}

		// using for-each loop for iteration over Map.entrySet()

		for (Entry<Character, Integer> entry : map.entrySet())
			System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());

		char maxkey = ' ';
		int maxvalue = 0;
		for (Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue() > maxvalue) {
				maxkey = entry.getKey();
				maxvalue = entry.getValue();
			}
		}
		System.out.println(maxkey + "=" + maxvalue);

	}

}
