package package2;

import java.util.HashSet;
import java.util.Set;

public class ArrayCommonElementIterative {

	public static void main(String[] args) {

		// create Array 1
		String[] arr1 = { "Article", "in", "Geeks", "for", "Geeks" };

		// create Array 2
		String[] arr2 = { "Geeks", "for", "Geeks" };

		Set<String> s = new HashSet<String>(); //to remove duplicate

		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					s.add(arr1[i]);
				}
			}
		}
		
		System.out.println(s);
	}

}
