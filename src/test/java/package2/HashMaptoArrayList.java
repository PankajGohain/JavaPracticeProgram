package package2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//https://www.geeksforgeeks.org/how-to-convert-hashmap-to-arraylist-in-java/

public class HashMaptoArrayList {

	public static void main(String[] args) {

		// Create an empty hash map
		HashMap<String, Integer> map = new HashMap<>();

		// Add elements to the map
		map.put("vishal", 10);
		map.put("sachin", 30);
		map.put("vaibhav", 20);

		// Set of the entries from the
		// HashMap
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();

		// Creating an ArrayList of Entry objects
		ArrayList<Map.Entry<String, Integer>> listOfEntry = new ArrayList<Map.Entry<String, Integer>>(entrySet);

		System.out.println(listOfEntry);

	}

}
