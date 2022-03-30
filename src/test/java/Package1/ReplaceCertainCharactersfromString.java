package Package1;

import java.util.Scanner;

public class ReplaceCertainCharactersfromString {

	public static void main(String[] args) {

		String str;
		char ch;
		char ch1[];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		str = sc.nextLine();
		System.out.println("Enter the character you want to replace");
		ch = sc.next().charAt(0);
		ch1 = str.toCharArray();

		for (int i = 0; i < str.length(); i++) {

			if (ch1[i] == ch) {

				// int index=str.indexOf(ch1);
				ch1[i] = 'x';
			}

		}

		System.out.println(ch1);
	}
}
