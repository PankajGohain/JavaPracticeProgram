package package2.Java8Feature.demo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierDemo {

	public static void main(String[] args) {


		//filtering process and not getting any result and want to return dummy data
		
		List<String> list1 = Arrays.asList();

		System.out.println(list1.stream().findAny().orElseGet(() -> "Hi viewers"));
		
		Supplier<String> sup= ()->"Hi Java";
		System.out.println(sup.get());
	}
}
