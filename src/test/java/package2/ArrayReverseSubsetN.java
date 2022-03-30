package package2;

import java.util.Arrays;

public class ArrayReverseSubsetN {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[][] array = { { 1, 2 }, { 3, 4 }, { 5, 6, 7 } };

		System.out.println(Arrays.deepToString(array)); // Print a Multi-dimensional Array

		int N = 3;

		int[] arr1 = reverseArray(arr, N);

		System.out.println(Arrays.toString(arr1));
		for (int a : arr) {
			System.out.print(a);
		}
	}

	public static int[] reverseArray(int[] A, int k) {
		for (int i = 0; i < A.length; i += k) {
			int left = i;
			// in case right larger than A.length
			int right = Math.min(i + k - 1, A.length - 1);

			// reverse sub array
			while (left < right) {
				int temp = A[left];
				A[left] = A[right];
				A[right] = temp;

				left++;
				right--;
			}
		}

		return A;
	}

}
