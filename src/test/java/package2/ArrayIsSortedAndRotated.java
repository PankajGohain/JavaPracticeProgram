package package2;

public class ArrayIsSortedAndRotated {

	public static void main(String[] args) {

	//	int arr[] = { 3, 4, 5, 1, 2 };
		int arr[] = { 5, 1, 2, 3, 4 };

		int n = arr.length;
		int x = 0, y = 0;

		// Traversing array 0 to last element.
		// n-1 is taken as we used i+1.
		for (int i = 0; i < n - 1; i++) {
			if (arr[i] < arr[i + 1])
				x++;
			else
				y++;
		}

		if (x == 1 || y == 1) {
			// Checking for last element with first.
			if (arr[n - 1] < arr[0])
				x++;
			else
				y++;

			// Checking for final result.
			if (x == 1 || y == 1)
				System.out.println("Sorted & Rotated");
			else {
				System.out.println("Not Sorted & Rotated");
			}
		}
	}

}
