package package2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class ArrayRemoveDuplicateElement{

	public static void main(String[] args) {

		int arr[] = { 1, 2, 5, 5, 6, 6, 7, 7, 2, 1 };
		Arrays.sort(arr);
		int j = 0;

		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				arr[j++] = arr[i];
			}
		}
		arr[j++] = arr[arr.length - 1];

		for (int k = 0; k < j; k++) {
			System.out.println(arr[k]);
		}
	}

}

//for unsorted array we need to first sort the array, this step does't needed for sorted array

/*
 * LinkedHashSet<Integer> set=new LinkedHashSet<Integer>(); 
 * for(Integer abc:arr)
 * { set.add(abc); 
 * System.out.println(set);
 * }
 */
