package Package1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LargestValueInArrayList {

	public static void main(String[] args) {
		
		List<Integer> li=new ArrayList<Integer>();
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(5);
		li.add(17);
		li.add(56);
		li.add(29);
		li.add(101);
		li.add(79);
		
		System.out.println("List is:"+ li);
		Collections.sort(li);
		System.out.println("Largest value in ArrayList is:" + li.get(li.size()-1));
	}
	

	

}
