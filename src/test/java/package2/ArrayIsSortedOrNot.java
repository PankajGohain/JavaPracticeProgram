package package2;

public class ArrayIsSortedOrNot {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 9, 6 };
		System.out.println(isSorted(a)); // true
	}

	public static boolean isSorted(int[] a) {
		// base case
		if (a == null || a.length <= 1) {
			return true;
		}

		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] > a[i + 1]) {
				return false;
			}
		}

		return true;
	}

}
