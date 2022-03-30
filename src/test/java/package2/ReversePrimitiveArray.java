package package2;

import java.util.Arrays;
import java.util.Collections;

public class ReversePrimitiveArray {

	public static void main(String[] args) {

		// Integer arr[] = new Integer[] { -4, 8, 6, -5, 6, -2, 1, 2, 3, -11 };
		String[] arr = new String[] { "FF", "PP", "AA", "OO", "DD" };

		Arrays.sort(arr, Collections.reverseOrder());

		for (String a : arr) {
			System.out.println(a);
		}

		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
	}

}
