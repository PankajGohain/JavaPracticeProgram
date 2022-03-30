package package2;

import java.util.Scanner;

public class FindLenghtOfString {

	public static void main(String[] args) {

		int i = 0;
		String str;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		str = sc.nextLine();
		char ch[] = str.toCharArray();

		for (char c : ch) {
			i++;
		}
		System.out.println("Length of the string = " + i);
	}
}
