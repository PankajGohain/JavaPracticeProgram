package package2;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class HashmapGetSecHighElement {

	public static void main(String args[]) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("Pankaj", 1);
        map.put("Amit", 2);
        map.put("Rahul", 5);
        map.put("Chetan", 7);
        map.put("Vinod", 6);
        map.put("Amit", 8);
        map.put("Rajesh", 7);

        List<Entry<String, Integer>> result = map.entrySet()
                .stream()
                .collect(Collectors.groupingBy(e -> e.getValue()))
                .entrySet()
                .stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByKey()))
                .skip(1)
                .findFirst()
                .get()
                .getValue();

        System.out.println(result);
    }

}
