package package2;

public class ArraySearchIndexSortedRotated {

	public static void main(String[] args) {

		int arr[] = { 16, 19, 21, 25, 3, 5, 8, 10 };

		int low = 0;
		int high = arr.length - 1;
		int mid = 0;
		int search = 5;

		while (low <= high) {
			mid = low + (high - low) / 2;

			if (arr[mid] == search) {
				System.out.println("Index of the element is:" + mid);
			}

			if (arr[mid] <= arr[high]) {
				// Right is sorted
				if (search > arr[mid] && search <= arr[high]) {
					low = mid + 1;
				} else {
					high = mid = 1;

				}

			} else {
				// Left part is sorted
				if (search >= arr[low] && search < arr[mid]) {
					high = mid - 1;
				} else {
					low = mid + 1;
				}
			}

		}
	}

}
