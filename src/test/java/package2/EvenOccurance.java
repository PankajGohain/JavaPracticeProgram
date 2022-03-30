package package2;

public class EvenOccurance {

	public static void main(String[] args) {

		int arr[] = { 1, 4, 6, 2, 9, 4, 2, 9, 11, 44, 77 };

		for (int i = 1; i < arr.length - 1; i += 2) {
			System.out.println(arr[i]);
		}
	}

}
