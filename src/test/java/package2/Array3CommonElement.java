package package2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
//https://www.youtube.com/watch?v=rUPdTNmKa6A
import java.util.Set;

public class Array3CommonElement {

	public static void main(String[] args) {
		// int[] a = { 1, 2, 3, 5, 4 ,4}; //1 2 3 4 5
		// int[] b = { 6, 7, 8, 9, 2, 1, 5 }; //1 2 5 6 7 8 9
		// int[] c = { 10, 11, 12, 5, 7, 1 }; //1 5 7 10 11 12
		int a[] = { 1, 5, 10, 20, 40, 80, 80 };
		int b[] = { 6, 7, 20, 80, 80, 100 };
		int c[] = { 3, 4, 15, 20, 30, 70, 80, 80, 120 };

		Arrays.sort(a);
		Arrays.sort(b);
		Arrays.sort(c);
		int i = 0;
		int j = 0;
		int k = 0;

		ArrayList<Integer> comEle = new ArrayList<Integer>();
		// Set<Integer> comEle = new HashSet<Integer>(); // use this if there are duplicate element
		while (i < a.length && j < b.length && k < c.length) {

			if (a[i] == b[j] && b[j] == c[k]) {

				comEle.add(a[i]);
				i++;
				j++;
				k++;
			} else if (a[i] < b[j]) { // Else If x < y, we can move ahead in ar1[] as x cannot be a common element.
				i++;
			} else if (b[j] < c[k]) {
				j++;

			} else {
				k++;
			}

		}

		System.out.println(comEle);
	}

}
