package package2;

import java.util.HashMap;
import java.util.Map;
import static java.util.Map.entry;

public class HashMapInsideMap {

	public static void main(String[] args) {

		Map<String, Map<String, String>> hmap = new HashMap<String, Map<String, String>>();

		Map<String, String> imap = new HashMap<String, String>();
		imap.put("B", "C");
		imap.put("D", "E");

		hmap.put("A", imap);

		System.out.println(hmap.get("A").get("B"));
		System.out.println(hmap.get("A").get("D"));

		// https://stackoverflow.com/questions/6802483/how-to-directly-initialize-a-hashmap-in-a-literal-way

		Map<String, String> test2 = Map.ofEntries(entry("a", "b"), entry("c", "d"));
		System.out.println(test2);

		Map<String, String> test1 = Map.of("e", "f", "g", "h", "i", "j");
		System.out.println(test1);
	}

}
