package Package1;

import java.util.Scanner;

public class stringSplosion {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.nextLine();
		String result="";
		 for(int i=0;i<str.length();i++){
			 
			 result=result+str.substring(0,i+1);
		 }
		 
		 System.out.println(result);

	}

}
