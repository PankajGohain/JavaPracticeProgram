package package2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//https://www.youtube.com/watch?v=DZM0GyL8Ars&list=PLlhM4lkb2sEiB1S_dHX8id1i_IN81t-q2&index=13

public class InsertElemenIntoArray {

	public static void main(String[] args) {

		int arr[] = { 10, 20, 30, 50, 60 };

		int pos = 4;
		int element = 40;

		for (int i = arr.length - 1; i > pos - 1; i--) {

			arr[i] = arr[i - 1];

		}
		arr[pos - 1] = element;

		System.out.println(Arrays.toString(arr));

		String array[]= {"a","b","c"};
		
		// Method 1
		List<String> list = Arrays.asList(array);
		System.out.println(list);

		// Method 2
		List<String> list1 = new ArrayList<String>();
		Collections.addAll(list1, array);
		System.out.println(list1);

		// Method 3
		List<String> list2 = new ArrayList<String>();
		for (String text : array) {
			list2.add(text);
		}
		System.out.println(list2);

		// --------------------------------

		String[] itemsArray = new String[itemList.size()];
		itemsArray = itemList.toArray(itemsArray);

		Integer[] intArray = new Integer[intList.size()];
		intArray = intList.toArray(intArray);
	}

}
