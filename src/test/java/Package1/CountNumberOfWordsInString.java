package Package1;

import java.util.Scanner;

public class CountNumberOfWordsInString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.nextLine();
		String[] str_arr=str.split("\\s");
		
		int count=str_arr.length;
		System.out.println("Number of Words in string is: "+count);
	}

}
