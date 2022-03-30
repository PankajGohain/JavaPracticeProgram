package package2;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {

		 int arr[] = { 3, 60, 35, 2, 45, 320, 5, 0, 8, -1, -2, -4 };

		//int arr[] = { 0, 1, 1, 0, 1, 1, 0, 1, 0, 0 };

		int temp;

		for (int i = 0; i < arr.length; i++)// number of round
		{
			for (int j = 0; j < arr.length - 1 - i; j++) // compare adjacent number, -i means no need to check the last
															// number
			{
				if (arr[j] > arr[j + 1]) {

					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;

				}
			}
		}

		System.out.println(Arrays.toString(arr));
	}

}
