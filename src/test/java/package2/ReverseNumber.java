	package package2;

public class ReverseNumber {

	public static void main(String[] args) {

		// Approach1
		int number = 1234567;
		int number1 = 23456789;
		int rev = 0;
		while (number != 0) {
			rev = rev * 10 + number % 10;
			number = number / 10;
		}
		System.out.println(rev);
		// Approach2
		StringBuilder sb = new StringBuilder(number1);
		System.out.println(sb.append(number1).reverse());
		
		//Approach3
		StringBuffer sb1=new StringBuffer(String.valueOf(number1));
		System.out.println(sb1.reverse());
	}

}
	