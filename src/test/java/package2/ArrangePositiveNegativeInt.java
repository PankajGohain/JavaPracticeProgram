package package2;

import java.util.Arrays;

public class ArrangePositiveNegativeInt {

	public static void main(String[] args) {
		int arr[] = { -4, 8, 6, -5, 6, -2, 1, 2, 3, -11 };
		int arr1[] = { -8, 8, 6, -9, 6, -2, 1, 2, 3, -12 };
//		int arr[] = { 1, 2, 0, 4, 3, 0, 9, 0, 67, 43, 0, 5, 0 };

		Arrays.sort(arr1);
		System.out.println("Array1"+Arrays.toString(arr1));

		for (int i = 0; i < arr.length - 1; i++) {

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}

			}

		}
		System.out.println(Arrays.toString(arr));
	}
}