package package2;

import java.util.HashSet;
import java.util.Set;

public class Array_SubsetOfAnotherArray {

	public static void main(String[] args) {

		int arr1[] = { 11, 1, 13, 21, 3, 7 };
		int arr2[] = { 11, 3, 7, 1 ,5};
		int size1 = 0;

		Set<Integer> s = new HashSet<Integer>();

		for (int i : arr1) {
			s.add(i);
		}

		size1 = s.size();

		for (int i : arr2) {
			s.add(i);
		}

		if (size1 == s.size()) {
			System.out.println("arr2 is subset of arr1");
		} else {
			System.out.println("No subset");
		}
	}

}
