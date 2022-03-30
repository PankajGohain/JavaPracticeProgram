package Package1;

import java.util.Scanner;

public class arrayCount9 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of an array");
		int n=sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter array elements");
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		
		int count=0;
		
		for(int i=0;i<n;i++){
			
			if(a[i]==9){
				
				count++;
			}
		}
		
		System.out.println(count);

	}

}
