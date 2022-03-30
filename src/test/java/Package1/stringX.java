package Package1;

import java.util.ArrayList;
import java.util.Scanner;

public class stringX {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.nextLine();
		char ch[]=str.toCharArray();
		String result="";
		for(int i=1;i<ch.length-1;i++){
			
			if(ch[i]=='x'){
				
				char ch1=ch[i];
				result=String.valueOf(ch1);
				str=str.replace(result, "");
			}
					
		}
		
		System.out.println(str);
		
	}
}