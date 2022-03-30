package package2;

import java.util.HashSet;
import java.util.Set;

//retainAll() method retains/keeps only those elements of the Set that are contained in the passed Collection.
//The retainAll () method of Java ArrayList class keeps only elements in the original list that are 
//contained in the specified collection. In other words, it replaces the original list with the specified list.

public class ArrayCommonElement {

	public static void main(String[] args) {
		int[] arr1 = { 3, 10, 1, 0, 9 };
		int[] arr2 = { 32, 5, 10, 6, 9, 1 };
		findCommonElement(arr1, arr2);
	}

	public static void findCommonElement(int[] arr1, int[] arr2) {
		Set<Integer> set1 = new HashSet<>();
		Set<Integer> set2 = new HashSet<>();
		// adding elements from array1
		for (int i : arr1) {
			set1.add(i);
		}
		// adding elements from array2
		for (int i : arr2) {
			set2.add(i);
		}
		set1.retainAll(set2);
		System.out.println("Common elements- " + set1);
	}
}


//Time Complexity: O(n) 