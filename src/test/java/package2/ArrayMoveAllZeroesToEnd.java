package package2;

public class ArrayMoveAllZeroesToEnd {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 0, 4, 3, 0, 9, 0, 67, 43, 0, 5, 0 };
		int len = arr.length;
		int count = 0;

		// Traverse the array. If element encountered is
		// non-zero, then replace the element at index 'count'
		// with this element
		for (int i = 0; i < len; i++) {

			if (arr[i] != 0)
				arr[count++] = arr[i];
		}

		// Now all non-zero elements have been shifted to
		// front and 'count' is set as index of first 0.
		// Make all elements 0 from count to end.
		while (count < len) {
			arr[count++] = 0;
		}

		for (int i = 0; i < len; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}