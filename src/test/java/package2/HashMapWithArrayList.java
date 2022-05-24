package package2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class HashMapWithArrayList {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		// Creating HashMap object with ArrayList as Value
		HashMap<String, ArrayList<String>> map = new HashMap<>();

		// Inserting key-value pairs in the above map
		map.put("USA", new ArrayList(Arrays.asList("Boston", "NewYork", "San-Francisco")));
		map.put("INDIA", new ArrayList(Arrays.asList("Bangalore", "Mumbai", "Delhi")));
		map.put("UK", new ArrayList(Arrays.asList("Leicester", "London", "Birmingham")));

		// Iterating the Map
		for (Map.Entry<String, ArrayList<String>> entry : map.entrySet()) {
			// Use entry.getKey() to fetch Key from entry object
			System.out.println("Iterating cities of the country: " + entry.getKey());
			// Iterating the ArrayList
			// Use entry.getValue() to fetch ArrayList value from entry object
			for (String city : entry.getValue()) {
				System.out.println(city);
			}
		}
	}
}