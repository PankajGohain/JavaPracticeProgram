package package2;

public class ArrayMaxPair {

	public static void main(String[] args) {

		int[] arr = { 2, 3, 5, 7, -7, 5, 8, -5, 99 };
		int maxPairProd = Integer.MIN_VALUE;
		int pos1 = 0, pos2 = 0;

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {

				if (maxPairProd < arr[i] * arr[j]) {
					maxPairProd = arr[i] * arr[j];
					pos1 = i;
					pos2 = j;
				}

			}

		}
		System.out.println("Max product:" + maxPairProd);
		System.out.print("Pair is:" + arr[pos1] + ", " + arr[pos2]);

	}

}
// time complexity-O(n power2)