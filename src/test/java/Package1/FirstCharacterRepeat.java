package Package1;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class FirstCharacterRepeat {

	public static void main(String[] args) {
		int count = 0;

		Scanner sc = new Scanner(System.in);

		String s = sc.nextLine();
		char[] arr1 = s.toCharArray();

		Map<Character, Integer> map1 = new LinkedHashMap<Character, Integer>();

		for (char c : arr1) {

			if (map1.containsKey(c)) {
				count = map1.get(c);
				map1.put(c, ++count);
			} else {
				map1.put(c, 1);
			}

		}
		Set<Character> s1 = map1.keySet();

		for (Character ch : s1) {

			if (map1.get(ch) == 3) {
				System.out.println(ch);
				break;
			}
		}
	}

}
