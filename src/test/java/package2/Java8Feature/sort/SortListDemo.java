package package2.Java8Feature.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import package2.Java8Feature.example.DataBase;
import package2.Java8Feature.example.Employee;

public class SortListDemo {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		list.add(8);
		list.add(3);
		list.add(12);
		list.add(4);

		// For sorting primitive data type through traditional & primitive data type

		Collections.sort(list);// Ascending
		System.out.println(list);

		list.stream().sorted().forEach(s -> System.out.println(s));// Ascending

		list.stream().sorted(Comparator.reverseOrder()).forEach(s -> System.out.println(s));// Descending
		
		

		// For sorting object data type

		List<Employee> employees = DataBase.getEmployees();

		// through traditional way

		Collections.sort(employees, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				return (int) (o1.getSalary() - o2.getSalary());// ascending
			}
		});

		System.out.println(employees);

		// through stream

		Collections.sort(employees, (o1, o2) -> (int) (o1.getSalary() - o2.getSalary()));
		System.out.println(employees);

		employees.stream().sorted((o1, o2) -> (int) (o2.getSalary() - o1.getSalary())).forEach(System.out::println);

		employees.stream().sorted(Comparator.comparing(emp -> emp.getSalary())).forEach(System.out::println);

		// Method reference
		employees.stream().sorted(Comparator.comparing(Employee::getDept)).forEach(System.out::println);

	}
}
