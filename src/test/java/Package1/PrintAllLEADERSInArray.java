// Write a Java program to print all the LEADERS in the array

package Package1;

import java.util.Scanner;

public class PrintAllLEADERSInArray {

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size");
        int n =sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the array elements");
        for(int i=0;i<n;i++){
        	
        	a[i]=sc.nextInt();
        }
        
        for(int i=0;i<n;i++){
        	int j;
        	for(j=i+1;j<n;j++){
        		
        		if(a[i]<=a[j])
        			
        	            break;
        	}
        	
        	if(j==a.length)
        	System.out.println("Leader element is: "+a[i]);
        }
	}

}
