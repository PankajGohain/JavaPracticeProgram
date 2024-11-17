package package2.Java8Feature.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

import package2.Java8Feature.example.Employee;

public class SortMapDemo {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<>();
		map.put("eight", 8);
		map.put("four", 4);
		map.put("ten", 10);
		map.put("two", 2);

		// get List from Map
		List<Entry<String, Integer>> entries = new ArrayList<>(map.entrySet());

		Collections.sort(entries, new Comparator<Entry<String, Integer>>() {

			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				return o1.getKey().compareTo(o2.getKey());
			}
		});

		// Through Lambda
		Collections.sort(entries, (o1, o2) -> o1.getKey().compareTo(o2.getKey()));

		for (Entry<String, Integer> entry : entries) {
			System.out.println(entry.getKey() + "   " + entry.getValue());
		}

		// Through stream
		map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);

		map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);

		Map<Employee, Integer> employeeMap = new TreeMap<>();
		employeeMap.put(new Employee(388, "Bikash", "CIVIL", 900000), 90);
		employeeMap.put(new Employee(470, "Bimal", "DEFENCE", 500000), 50);
		employeeMap.put(new Employee(624, "Sourav", "CORE", 400000), 40);
		employeeMap.put(new Employee(284, "Prakash", "SOCIAL", 1200000), 120);

		// Lambda
		Map<Employee, Integer> employeeMapSort = new TreeMap<>((o1, o2) -> (int) (o2.getSalary() - o1.getSalary()));
		System.out.println(employeeMapSort);

		employeeMap.entrySet().stream()
				.sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getDept).reversed()))
				.forEach(System.out::println);

		employeeMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getSalary)))
				.forEach(System.out::println);

	}
}
