package package2;

public class FactorialOfANumber {

	public static void main(String[] args) {

		int num = 10;
		int result = 1;

		while (num > 0) {
			result = result * num;
			num--;
		}

		System.out.println("Factorial of a number is:" + result);

	}

}
