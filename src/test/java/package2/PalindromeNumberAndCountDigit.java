package package2;

public class PalindromeNumberAndCountDigit {

	public static void main(String[] args) {

		int num = 1615678;
		int original_num=num;
		int rev = 0;
		int count=0;
		while (num > 0) {

			rev = (rev * 10) + num % 10;

			num = num / 10;
			count++;
		}
		System.out.println(rev);

		if (original_num == rev) {
			System.out.println("Number is palindrome");
		} else {
			System.out.println("Not palindrome");
		}
		
		System.out.println("Size of number is: "+count);
	}
}