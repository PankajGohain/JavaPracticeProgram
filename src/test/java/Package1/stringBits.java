package Package1;

import java.util.Scanner;

public class stringBits {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.nextLine();
		char ch[]=str.toCharArray();
		String result="";
		
		for(int i=0;i<ch.length;i++,i++){
			
			result=result+str.charAt(i);
		}
		
		System.out.println(result);

	}

}
