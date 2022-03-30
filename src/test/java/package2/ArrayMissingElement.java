package package2;

import java.util.Arrays;

public class ArrayMissingElement {

	public static void main(String[] args) {

		int arr[] = { 1, 3, 6, 4, 1, 2 };
		Arrays.sort(arr);
		int j = 1;

		for (int a : arr) {
			if (a == j) {
				j++;
			}
		}

		System.out.println(j);
	}

}
