package package2;

import java.util.Arrays;

// Find the largest and smallest number in an unsorted integer array or

public class Array_CheckArrayIsConsecutive {

	public static void main(String[] args) {
		int[] arr = { 5, 2, 3, 1, 4, 6 };
		int min = arr[0];
		int max = arr[0];

		for (int a : arr) {
			if (a > max) {
				max = a;
			} else if (a < min) {
				min = a;
			}

		}
		System.out.println("Maximum Value is: " + max + " and " + "Minimum Value is: " + min);

		if (arr.length == (max - min) + 1) {
			System.out.println("Consequtive Array: " + Arrays.toString(arr));
		} else
			System.out.println("Not Consequtive Array: " + Arrays.toString(arr));
	}

}

//5, 2, 3, 1, 4,6
//{ 0, 990, 988, 992, 989 }

//Time complexity = O(n), Space complexity = O(1)