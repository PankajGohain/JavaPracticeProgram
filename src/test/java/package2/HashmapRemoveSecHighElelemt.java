package package2;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class HashmapRemoveSecHighElelemt {

	public static void main(String[] args) {
        // Sample HashMap
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 10);
        map.put("B", 20);
        map.put("C", 30);
        map.put("D", 40);
        map.put("E", 50);

        // Remove the second-highest element
        Map<String, Integer> result = removeSecondHighest(map);
        System.out.println("HashMap after removing the second highest element:");
        System.out.println(result);
    }

    public static Map<String, Integer> removeSecondHighest(Map<String, Integer> map) {
        // Convert the HashMap entries into a Stream
        return map.entrySet().stream()
                // Sort the Stream based on the values in descending order
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                // Skip the first element (highest value)
                .skip(1)
                // Get the second element (second-highest value)
                .limit(1)
                // Get the value of the second-highest element
                .map(Entry::getValue)
                // Filter the Stream to remove entries with the second-highest value
                .flatMap(value -> map.entrySet().stream().filter(entry -> !entry.getValue().equals(value)))
                // Collect the remaining entries into a new HashMap
                .collect(Collectors.toMap(Entry::getKey, Entry::getValue));
    }

}
