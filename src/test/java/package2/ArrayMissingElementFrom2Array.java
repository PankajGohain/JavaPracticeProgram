package package2;

public class ArrayMissingElementFrom2Array {

	public static void main(String[] args) {

		int arr1[] = { 1, 2, 3, 4, 5, 6, 7};
		int arr2[] = { 1, 3, 4, 5, 6, 7 };

		int sum1 = 0;
		int sum2 = 0;
		for (int a : arr1) {
			sum1 = sum1 + a;
		}
		System.out.println(sum1);

		for (int b : arr2) {
			sum2 = sum2 + b;
		}

		System.out.println(sum2);
		
		int missingValue = sum1 - sum2;

		System.out.println("Missing number is:" + missingValue);
	}

}
