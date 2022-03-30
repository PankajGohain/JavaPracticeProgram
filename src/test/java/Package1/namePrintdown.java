package Package1;

import java.util.Scanner;

public class namePrintdown {
	
	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	String name= sc.nextLine();
	char arr[]= name.toCharArray();
	int k=arr.length;
	
	int rows= (name.length()/2) + 1;
	
	for(int g=0; g<rows; g++)
	{
		int m=g;
	for(int i=0; i<k; i++) {
		  
			System.out.print(arr[m++]);
			
		}
		
		
			System.out.println();
			for(int j=0; j<=g; j++) {
				
				System.out.print(" ");
			}
			
			k=k-2;
		
	}

	}}




