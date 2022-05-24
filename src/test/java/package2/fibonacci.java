package package2;

public class fibonacci {

	public static void main(String[] args) {

		int num1 = 0;
		int num2 = 1;

		int k = 10;
		int i = 0;

		while (i <= k) {
			System.out.print(num1+" ");

			int sum = num1 + num2;
			num1 = num2;
			num2 = sum;
			i++;
		}

	}

}
