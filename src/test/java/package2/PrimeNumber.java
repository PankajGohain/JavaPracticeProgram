package package2;

public class PrimeNumber {

	public static void main(String[] args) {

		int num =2;
		int m = num / 2;
		int flag = 0;
		if (num == 0 || num == 1) {
			System.out.println("Not Prime");
		} else if (num == 2) {
			System.out.println("Prime");
		} else {
			for (int i = 2; i < m; i++) {

				if (num % i == 0) {

					flag = 1;
					System.out.println("Not Prime");
					break;
				}
			}
		}

		if (flag == 0) {
			System.out.println("Prime");
		}

	}
}
