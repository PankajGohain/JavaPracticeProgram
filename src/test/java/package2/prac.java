package package2;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import Package1.newclass;

public class prac {

	public static void main(String[] args) {

		String s1 = "Pankaj Kumar Gohain";
		String s2 = "Pankaj Kumar Gohain";
		int arr[] = { 1, 2, 5, 5, 6, 6, 7, 7, 2, 1 };

		int arr1[] = { 0, 1, 0, 1, 1, 0, 0, 1 };

		StringBuilder sbi = new StringBuilder(s1);
		sbi.reverse();
		System.out.println(sbi);

		StringBuffer sbf = new StringBuffer(s2);
		sbf.reverse();
		System.out.println(sbf);

		Set<Integer> hset = new HashSet<Integer>();

		for (Integer a : arr) {
			hset.add(a);
		}

		System.out.println(hset);

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 7) {
				System.out.println("Value present");
				break;
			}
		}

		Arrays.sort(arr1);
		System.out.println(Arrays.toString(arr1));
		for (int i = arr1.length - 1; i >= 0; i--) {
			System.out.print(arr1[i]+" ");
		}

	}

}
