package Package1;

import java.util.Scanner;

public class Selection_sort {
	
	public static void main(String[] args) {
		System.out.println("Enter any 7 number to sort them in ascending order");
		int[] arr = new int[7];
		int min;
		int k;
		int temp = 0;
		for (int i = 0; i < 7; i++) {

			Scanner sc = new Scanner(System.in);
			arr[i] = sc.nextInt();

		}
		for (int j = 0; j < arr.length; j++) {
			
			min=j;
			for (k = j+1; k < arr.length; k++) {

				if (arr[k] < arr[min]) {
					
					min= k;}}
					temp = arr[min];
					arr[min] = arr[j];
					arr[j] = temp;
				
			}
		

		System.out.println("Printing the sorted array");
		for (int s = 0; s < 7; s++) {
			System.out.println(arr[s]);
		}
	}

}