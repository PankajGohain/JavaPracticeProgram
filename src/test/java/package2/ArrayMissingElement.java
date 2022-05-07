package package2;

import java.util.Arrays;

public class ArrayMissingElement {

	public static void main(String[] args) {

		int arr[] = { 1, 3, 6, 4, 2 };
		Arrays.sort(arr); // 1,1,2,3,4,6
		int j = 1;

		for (int a : arr) {
			if (a == j) {
				j++;
			}
		}

		System.out.println(j);

		// =====================================
		int expectedLength = arr.length + 1;

		int expSum = expectedLength * (expectedLength + 1) / 2;

		int arrSum = 0;
		for (int a : arr) {
			arrSum = arrSum + a;
		}

		int missingValue = expSum - arrSum;
		System.out.println("Missing value is:" + missingValue);
	}

}
