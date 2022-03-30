package package2;

import java.util.Arrays;

//https://www.geeksforgeeks.org/remove-consecutive-duplicates-string/?ref=lbp

public class StringRemoveConsecutiveElement {

	public static void main(String[] args) {

		String str = "geeksforgeeks";
		char arr[] = str.toCharArray();

		int j = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[j] != arr[i]) {
				j++;
				arr[j] = arr[i];
				System.out.println(arr[j]);
			}
		}
		System.out.println(Arrays.copyOfRange(arr, 0, j + 1));

	//	System.out.println(arr);
	}

}
