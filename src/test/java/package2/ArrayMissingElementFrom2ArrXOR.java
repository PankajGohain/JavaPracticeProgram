package package2;

//https://stackoverflow.com/questions/22434225/how-to-find-missing-number-given-two-arrays-as-input-and-find-a-number-that-is

public class ArrayMissingElementFrom2ArrXOR {

	public static void main(String[] args) {

		int[] arr1 = { 3, 7, 2, 90, 34 };
		int[] arr2 = { 2, 7, 34, 3 };
		int xor = 0;
		for (int i = 0; i < arr1.length; i++) {
			xor ^= arr1[i];
		}
		for (int i = 0; i < arr2.length; i++) {
			xor ^= arr2[i];
		}
		System.out.println("missing number: " + xor);
	}

}
