package Package1;

import java.util.LinkedHashSet;

public class removeDuplicatesLinkedHashSet {

	/*
	 * Function removes duplicate characters from the string This function work
	 * in-place
	 */
	public void removeDuplicates(String str) {
		LinkedHashSet<Character> lhs = new LinkedHashSet<>();
		for (int i = 0; i < str.length(); i++)
			lhs.add(str.charAt(i));

		// print string after deleting duplicate elements
		for (Character ch : lhs)
			System.out.print(ch);
	}

	/* Driver program to test removeDuplicates */
	public static void main(String args[]) {
		String str = "geeksforgeeks";
		removeDuplicatesLinkedHashSet r = new removeDuplicatesLinkedHashSet();
		r.removeDuplicates(str);
	}
}

/* IMPORTANT NOTE
 * A LinkedHashSet is an ordered version of HashSet that maintains a
 * doubly-linked List across all elements. When iterating through a HashSet the
 * order is unpredictable, while a LinkedHashSet lets us iterate through the
 * elements in the order in which they were inserted. When cycling through
 * LinkedHashSet using an iterator, the elements will be returned in the order
 * in which they were inserted
 */