package package2;

public class PrimeNumber {

	public static void main(String[] args) {

		int num =7;
		int m = num / 2;
		int count = 0;
		if (num == 0 || num == 1) {
			System.out.println("Not Prime");
		} else if (num == 2) {
			System.out.println("Prime");
		} else {
			for (int i = 2; i < m; i++) {

				if (num % i == 0) {

					count++;
					System.out.println("Not Prime");
					break;
				}
			}
		}

		if (count == 0) {
			System.out.println("Prime");
		}

	}
}
