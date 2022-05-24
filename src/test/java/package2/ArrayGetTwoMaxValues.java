package package2;

public class ArrayGetTwoMaxValues {

	public static void main(String[] args) {

		int list[] = { 15, 24, 48, 21, 43, 11, 79, 93 };
		int max1 = 0;
		int max2 = 0;

		for (int n : list) {

			if (n > max1) {
				max2 = max1;
				max1 = n;
				System.out.println(max1 + "=============" + max2);
			} else if (n>max2) {
				max2 = n;
				System.out.println("=============" + max2);
			}
		}

		System.out.println(max1 + " " + max2);
	}

}
