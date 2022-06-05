package package2;

public class ClosesPalindromeToNumber {

	public static void main(String[] args) {

		String num = "119";
		System.out.println(nearestPalindromic(num));
	}

	public static String nearestPalindromic(String n) {
		long num = Long.parseLong(n);
		for (long i = 1;; i++) {
			if (isPalindrome(num - i))
				return "" + (num - i);
			if (isPalindrome(num + i))
				return "" + (num + i);
		}
	}

	static boolean isPalindrome(long x) {
		long t = x, rev = 0;
		while (t > 0) {
			rev = 10 * rev + t % 10;
			t /= 10;
		}
		return rev == x;
	}

}
