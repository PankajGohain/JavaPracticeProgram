package Package1;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		System.out.println("Enter any 7 number to sort them in ascending order");
		int[] arr = new int[7];
		int temp = 0;
		for (int i = 0; i < 7; i++) {

			Scanner sc = new Scanner(System.in);
			arr[i] = sc.nextInt();

		}
		for (int j = 0; j < arr.length; j++) {
			for (int k = 0; k < arr.length - j - 1; k++) {

				if (arr[k] > arr[k + 1]) {
					temp = arr[k];
					arr[k] = arr[k + 1];
					arr[k + 1] = temp;
				}
			}
		}

		System.out.println("Printing the sorted array");
		for (int s = 0; s < 7; s++) {
			System.out.println(arr[s]);
		}
	}

}
