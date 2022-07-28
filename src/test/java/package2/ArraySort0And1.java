package package2;

public class ArraySort0And1 {

	public static void main(String[] args) {
	//	int arr[] = { 0, 1, 0, 1, 1, 0, 0, 1 };
	int arr[] = { 1, 2, 0, 4, 3, 0, 9, 0, 67, 43, 0, 5, 0 };
		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				j++;
			}
		}

		for (int a : arr) {
			System.out.print(a + ",");
		}
	}

}
