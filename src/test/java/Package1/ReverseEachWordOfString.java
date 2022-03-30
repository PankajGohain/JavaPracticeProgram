package Package1;

import java.util.Scanner;

public class ReverseEachWordOfString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		{
			String str = sc.nextLine();
			String res_str = "";
			String str_arr[] = str.split("\\s");

			for (int i = 0; i < str_arr.length; i++) {

				res_str = reverseword(str_arr[i]);
				System.out.print(res_str + " ");
			}

		}

	}

	private static String reverseword(String string) {
		String res = "";
		for (int i = string.length() - 1; i >= 0; i--) {
			res = res + string.charAt(i);

		}

		return res;

	}

}
