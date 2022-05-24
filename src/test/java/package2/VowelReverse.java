package package2;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class VowelReverse {

	public static void main(String[] args) {

		String str = "test pankaj";
		String rev = "";

		String arr[] = str.split(" ");

		Map<Character, Integer> hmap = new LinkedHashMap<Character, Integer>();

		for (int i = 0; i < arr.length; i++) {
			String word = arr[i];
			for (int j = 0; j < word.length(); j++) {
				if (word.charAt(j) == 'a' || word.charAt(j) == 'e' || word.charAt(j) == 'i' || word.charAt(j) == 'o'
						|| word.charAt(j) == 'u') {

					if (hmap.containsKey(word.charAt(j))) {
						hmap.put(word.charAt(j), hmap.get(word.charAt(j)) + 1);
						StringBuffer sb = new StringBuffer(word);
						rev = rev + sb.reverse();
						break;
					} else {
						hmap.put(word.charAt(j), 1);
						rev = rev + " "+ arr[i];
					}
				} /*
					 * else { rev = rev + " "+ arr[i]; }
					 */
			}

			Set<Character> s = hmap.keySet();
			for (Character abc : s) {
				System.out.println(abc + "=" + hmap.get(abc));
			}

		}

		System.out.println(rev);
	}
}