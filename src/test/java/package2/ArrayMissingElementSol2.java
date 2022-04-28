package package2;

public class ArrayMissingElementSol2 {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 7, 8, 9, 10, 5 };

		int n = arr.length+1;		//actual number of element
		System.out.println(n);

		int sum = n * (n + 1) / 2; // sum of n number
		int restSum = 0;
		for (int a : arr) {
			restSum = restSum + a;
		}

		int missingNo = sum-restSum;
		System.out.println("Missing number is:" + missingNo);
	}

}
