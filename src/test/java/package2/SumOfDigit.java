package package2;

public class SumOfDigit {

	public static void main(String[] args) {

		int num = 123456;
		int sum = 0;
		int rem = 0;

		while (num > 0) {

			sum = sum + num % 10;
			num = num / 10;
		}

		System.out.println("Sum is: " + sum);
	}

}
