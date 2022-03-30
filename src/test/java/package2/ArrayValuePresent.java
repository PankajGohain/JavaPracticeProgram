package package2;

import java.util.Arrays;
import java.util.List;

public class ArrayValuePresent {

	public static void main(String[] args) {

		Integer arr[] = { 5, 1, 1, 9, 7, 2, 6, 10 };
		int search = 3;

		List<Integer> listArr = Arrays.asList(arr);
		listArr.add(5, 100);

		if (listArr.contains(search)) {
			System.out.println("Present");
		} else {
			System.out.println("Not Present");
		}
	}

}
