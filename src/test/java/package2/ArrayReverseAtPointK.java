package package2;

import java.util.Arrays;

public class ArrayReverseAtPointK {

	public static void main(String[] args) {

		int arr[] = { 2, 5, 9, 8, 4, 99, 44, 22, 56, 75, 62 };
		int k = 5;

		if (k > arr.length) {
			System.out.println("can't be rotated");
		} else {

			for (int i = 0; i < k / 2; i++) {
				int temp = arr[i];
				arr[i] = arr[k - i - 1];
				arr[k - i - 1] = temp;
			}

			System.out.println(Arrays.toString(arr));
		}
	}

}

//Time Complexity=O(k)