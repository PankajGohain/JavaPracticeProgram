package Package1;

import java.util.Scanner;

public class makeTags {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the tag");
		String tag=sc.nextLine();
		System.out.println("Enter the word string");
		String str=sc.nextLine();
		System.out.println("<"+tag+">"+str+"</"+tag+">");

	}

}
