package package2;

public class fibonacci {

	public static void main(String[] args) {

		int num = 0;
		int num1 = 1;

		int k = 10;
		int i = 0;

		while (i <= k) {
			System.out.print(num+" ");

			int sum = num + num1;
			num = num1;
			num1 = sum;
			i++;
		}

	}

}
