package package2;

import java.util.Arrays;

public class ArrayFindAllMissingElementDuplicateArr {

	public static void main(String[] args) {

		int arr[] = { 0, 1, 2, 3, 5, 5, 7, 9, 9, 9, 9, 9, 12 };

		int temp[] = new int[arr.length]; //it initializes the array as array

		for (int i = 0; i < arr.length; i++) {
			temp[arr[i]] = 1;
		}

		System.out.println(Arrays.toString(temp));

		for (int i = 0; i < temp.length; i++) {
			if (temp[i] == 0)

				System.out.println(i);
		}

	}

}
