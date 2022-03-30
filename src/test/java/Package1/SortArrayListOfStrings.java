package Package1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortArrayListOfStrings {

	public static void main(String[] args) {
		
		List<String> li=new ArrayList<String>();
		li.add("Apple");
		li.add("Mango");
		li.add("Litchi");
		li.add("Grapes");
		li.add("Guava");
		
		System.out.println(li);
		Collections.sort(li);
		System.out.println("Sorted List is:" +li);

	}

}
