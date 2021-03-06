package Package1;

import java.util.HashMap;
import java.util.Scanner;

public class FirstNonRepeated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(" Please enter the input string :");
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		char c = firstNonRepeatedCharacter(s);
		System.out.println("The first non repeated character is :  " + c);
	}

	public static Character firstNonRepeatedCharacter(String str) {
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		int i, length;
		Character c;
		length = str.length(); // Scan string and build hash table
		for (i = 0; i < length; i++) {
			c = str.charAt(i);
			if (map.containsKey(c)) {
				// increment count corresponding to c
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}

		System.out.println("map view" + map);
		// Search map in in order of string str

		for (i = 0; i < length; i++) {
			c = str.charAt(i);
			System.out.println("----"+c);
			if (map.get(c) == 1)
				return c;
		}
		return null;
	}

}
