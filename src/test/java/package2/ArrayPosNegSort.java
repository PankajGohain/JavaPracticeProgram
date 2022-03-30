package package2;

import java.util.Arrays;

public class ArrayPosNegSort {

	public static void main(String[] args) {

		int arr[] = { -1, 6, 9, -4, -10, -9, 8, 8, 4 };
		int pos = 0, neg = 0;

		int sortedArr[] = Arrays.copyOf(arr, arr.length);

		System.out.println(Arrays.toString(sortedArr));

		for (int i = 0; i < arr.length - 1; i++) {

			while (arr[pos] < 0) {
				pos++;
			}
			sortedArr[i] = arr[pos++];
			i++;
			while (arr[neg] > 0) {
				neg++;
			}
			if (i < arr.length)
				sortedArr[i] = arr[neg++];
		}

		for (int f : sortedArr) {
			System.out.print(f + " ");
		}
	}

}
