package package2;

public class DivideArrayIntoEvenSumPair {

	public static void main(String[] args) {

		// int arr[] = { 1, 2, 3, 4, 5, 7 }; // {1,2,3,4,5,7}
		int arr[] = { 1, 2, 3, 4, 5, 6 };
		int N = arr.length;
		int countEven = 0, countOdd = 0;

		if (N % 2 == 1)
			System.out.println("Array can't be split into pairs");

		for (int i = 0; i < N; i++) {
			if (arr[i] % 2 == 0) {
				countEven++; // 1+1+1
			} else {
				countOdd++; // 1+1+1
			}
		}

		if (countEven % 2 == 0 && countOdd % 2 == 0) {
			System.out.println("Array can be split into pairs of even sum");
		} else {
			System.out.println("Array can't be split into pairs of even sum");
		}

		if (countEven == countOdd) {
			System.out.println("Array can be split into pairs of odd sum");
		} else {
			System.out.println("Array can't be split into pairs of odd sum");
		}
	}

}
