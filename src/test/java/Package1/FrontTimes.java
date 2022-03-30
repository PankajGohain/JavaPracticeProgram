package Package1;

import java.util.Scanner;

public class FrontTimes {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.nextLine();
		System.out.println("Enter the number of times you want to print front of the string");
		int n=sc.nextInt();
		frontTimes(str,n);

	}

	private static void frontTimes(String str, int n) {
		
		String result="";
		int frontlength=3;
		for(int i=0;i<n;i++){
			
			if(frontlength<str.length()){
			result=result+str.charAt(0)+str.charAt(1)+str.charAt(2);
			}
			
			else{
				result=result+str;
			}
		}
		
		System.out.println(result);
		
	}

}
