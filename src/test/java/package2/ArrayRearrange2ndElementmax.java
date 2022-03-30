package package2;

//Java program to rearrange a given array of unique elements such that every second element of the array is greater than its left and right elements.

import java.util.Arrays;

public class ArrayRearrange2ndElementmax {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 4, 9, 5, 3, 8, 7, 10, 12, 14 };

		Arrays.sort(arr);
		
		System.out.println(Arrays.toString(arr));

		for (int i = 0; i < arr.length; i += 2) {
			if ((i + 1) < arr.length) {
				int temp = arr[i + 1];
				arr[i + 1] = arr[i + 2];
				arr[i + 2] = temp;
			}
		}

		System.out.println(Arrays.toString(arr));
	}
}
