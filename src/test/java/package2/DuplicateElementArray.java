package package2;

import java.util.ArrayList;

public class DuplicateElementArray {

	public static void main(String[] args) {
		// int my_array[] = { 1, 2, 5, 5, 6, 6, 7, 2 };

		String[] my_array = { "bcd", "abd", "jude", "bcd", "oiu", "gzw", "oiu", "1", "2", "3", "2", "gzw" };

		ArrayList<String> arrList = new ArrayList<String>();

		for (int i = 0; i < my_array.length - 1; i++) {
			for (int j = i + 1; j < my_array.length; j++) {
				if (my_array[i] == my_array[j]) {
					System.out.println("Duplicate Element : " + my_array[i]);
					arrList.add(my_array[i]);
				}
			}
		}

		System.out.println(arrList);
	}
}

//Time complexity: O(n*n) 