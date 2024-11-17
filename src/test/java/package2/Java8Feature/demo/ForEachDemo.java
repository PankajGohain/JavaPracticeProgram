package package2.Java8Feature.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class ForEachDemo {

	// filter----> conditional check

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("Murrit");
		list.add("john");
		list.add("piter");
		list.add("marek");
		list.add("mac");

		for (String s : list) {
			if (s.startsWith("m")) {
				System.out.println(s);
			}
		}
		
		list.stream().forEach(t -> System.out.println(t));

		list.stream().filter(t -> t.startsWith("m")).forEach(t -> System.out.println(t));

		Map<Integer, String> map = new HashMap<>();

		map.put(1, "a");
		map.put(2, "b");
		map.put(3, "c");
		map.put(4, "d");

		//traditional method
		map.forEach((key,value)->System.out.println(key+": "+value));
		
		//stream forEach
		map.entrySet().stream().forEach(obj->System.out.println(obj));
		
		//stream filter
		map.entrySet().stream().filter(k->k.getKey()%2==0).forEach(obj->System.out.println(obj));
		 

		Consumer<String> consumer = (t) -> System.out.println(t);
		for (String s1 : list) {
			consumer.accept(s1);
		}

	}
}
