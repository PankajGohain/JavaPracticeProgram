package package2;

import java.util.LinkedList;
import java.util.List;

public class LinkedListReversed {

	public static void main(String[] args) {

		LinkedList<String> linked = new LinkedList<String>();
		linked.add("Pankaj");
		linked.add("Amit");
		linked.add("Piyush");
		linked.add("Pankaja");

		LinkedList<String> linked2 = new LinkedList<String>();

		linked.descendingIterator().forEachRemaining(linked2::add);

		System.out.println(linked2);
	}

}
