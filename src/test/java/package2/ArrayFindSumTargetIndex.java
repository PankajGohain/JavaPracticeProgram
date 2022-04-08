package package2;

import java.util.Arrays;
import java.util.HashMap;

public class ArrayFindSumTargetIndex {

	public static void main(String[] args) {

		int arr[] = { 2, 7, 11, 15 };
		int target = 18;

		int arr2[] = checkIndex(arr, target);

		System.out.println(Arrays.toString(arr2));
	}

	public static int[] checkIndex(int[] arr, int target) {
		int secondNumber = 0;

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < arr.length; i++) {

			secondNumber = target - arr[i];

			if (map.containsKey(secondNumber)) {
				
				return new int[] { map.get(secondNumber), i };

			} else {
				map.put(arr[i], i);
			}

		}
		return null;
	}
}
