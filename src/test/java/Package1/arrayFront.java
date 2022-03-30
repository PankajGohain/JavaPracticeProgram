package Package1;

import java.util.Scanner;

public class arrayFront {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array length");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter array elements");
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		boolean b = false;
		
		for(int i=0;i<4;i++){
		
			if(a[i]==9){
				
				b=true;
				break;
			}
			
			else{
				b=false;
			}
		}
		
		System.out.println(b);

	
}
}
