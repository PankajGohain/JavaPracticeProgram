package Package1;

import java.util.Scanner;

public class StringTimes {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.nextLine();
		System.out.println("Enter the number of times you want to print string");
		int n=sc.nextInt();
		stringTimes(str,n);

	}

	private static void stringTimes(String str, int n) {
		
		String result="";
		for(int i=0;i<n;i++){
			
			result=result+str;
		}
		
		System.out.print(result);
	}

}
