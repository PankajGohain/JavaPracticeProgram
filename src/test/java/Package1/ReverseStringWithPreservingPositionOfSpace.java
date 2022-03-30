package Package1;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseStringWithPreservingPositionOfSpace {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.nextLine();
		char inputarray[]=str.toCharArray();
		char resultarray[]=new char[inputarray.length];
		
		for(int i=0;i<inputarray.length;i++){
			
			if(inputarray[i]==' '){
				
				resultarray[i]=' ';
			}
		}
		
		int j=resultarray.length-1;
		
		for(int i=0;i<inputarray.length;i++){
			
			if(inputarray[i]!=' '){
				
				if(resultarray[j]==' '){
					
					j--;
				}
				
				resultarray[j]=inputarray[i];
				j--;
			}
		}
		String strnew= Arrays.toString(resultarray).substring(1,3*resultarray.length-1).replaceAll(",","");
		
		System.out.println(strnew);

	}

}
