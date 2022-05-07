package package2;

public class ArrayFindAllMissingElement {

	public static void main(String[] args) {

		int arr[] = { 6, 7, 10, 11, 13 };
		int count = 0;

		for (int i = arr[0]; i < arr[arr.length - 1]; i++) {
			if (arr[count] == i) {
				count++;
			} else {
				System.out.println("MIssing value:" + i);
			}
		}

	}

}
