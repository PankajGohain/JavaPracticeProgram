package package2;

import java.util.Arrays;

public class ArrayCheckTwoArrayEquals {

	public static void main(String[] args) {

		//first check length of both the arrays are equal
		
		int a[] = { 1, 2, 3, 4, 5, 6 };
		int b[] = { 6, 5, 4, 3, 2, 1 };
		boolean status = false;

		Arrays.sort(a);
		Arrays.sort(b);
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));

		for (int i = 0; i < a.length; i++) {
			if (a[i] != b[i]) {
				status = false;
			} else {
				status = true;
			}
		}
		if (status) {
			System.out.println("Arrays are equals");
		} else {
			System.out.println("Arrays are not equals");
		}
	}

}
