package Package1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class arraySort {

	public static void main(String[] args) {

		int arr[] = { 1, 0, 0, 1, 1, 0, 1, 0, 1 };

		Arrays.sort(arr);

		System.out.println("After sorting1:" + Arrays.toString(arr));

		ArrayList<Integer> abc = new ArrayList<Integer>(arr.length);

		for (int j : arr) {
			abc.add(j);
		}

		Collections.sort(abc);

		System.out.println("After sorting2:" + abc);

		int k = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				arr[k++] = 0;
			}
		}

		for (int i = k; i < arr.length; i++) {
			arr[k++] = 1;
		}

		System.out.println("After sorting3: " + Arrays.toString(arr));
	}

}
