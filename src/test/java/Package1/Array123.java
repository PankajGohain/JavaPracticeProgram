package Package1;

import java.util.Scanner;

public class Array123 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter array elements");
		for(int i=0;i<n;i++){
			
			a[i]=sc.nextInt();
		}
		boolean b=false;
		
		for(int i=0;i<n;i++){
			
			if(a[i]==1&&a[i+1]==2&&a[i+2]==3){
				
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
