package Package1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortList {

	public static void main(String[] args) {
		
		List<Integer> li = new ArrayList<Integer>();
		li.add(11);
		li.add(23);
		li.add(2);
		li.add(42);
		li.add(31);
		li.add(10);
		
		
		Collections.sort(li);
		System.out.println(li);
		System.out.println("Second highest number is"+ " " +li.get(li.size()-2));
		
		

	}

}
