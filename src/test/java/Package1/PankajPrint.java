package Package1;

import java.util.Scanner;

public class PankajPrint {

	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	String name= sc.nextLine();
	char arr[]= name.toCharArray();
	
	for(int i=0; i<name.length(); i++) {
		{
			for(int j=0; j<=i; j++) {
				
				System.out.print(arr[j]);
			}
			
			System.out.println();
		}
		
	}

	}

}
