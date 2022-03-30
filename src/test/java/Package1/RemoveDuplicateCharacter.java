package Package1;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicateCharacter {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String s = sc.nextLine();
		char[] arr = s.toCharArray();

		int end = arr.length;

		for (int i = 0; i < end; i++) {
			for (int j = i + 1; j < end; j++) {
				if (arr[i] == arr[j]) {
					int shiftLeft = j;
					for (int k = j + 1; k < end; k++, shiftLeft++) {
						arr[shiftLeft] = arr[k];
					}
					end--;
					j--;
				}
			}
		}

		for (int i = 0; i < end; i++) {
			System.out.print(arr[i]);

		}
	}
}
