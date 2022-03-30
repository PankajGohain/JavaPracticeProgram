package Package1;

import java.util.Scanner;

public class SecondLargestElement {

	public static void main(String[] args) {
		
		int n;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements in an array");
		n=sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter elements in an array");
		
		for(int i=0;i<n;i++){
			
			arr[i]=sc.nextInt();
		}
		
		secondlargestelement(arr);
	}

	public static void secondlargestelement(int[] arr) {
		
		int temp=0, size;
		
		size=arr.length;
		
		 for(int i=0;i<size;i++){
			 for(int j=1;j<size-i;j++){
				 
				 if(arr[j-1]>arr[j]){
					 
					 temp=arr[j-1];
					 arr[j-1]=arr[j];
					 arr[j]=temp;
				 }
			 }
		 }
		 
		 System.out.println("Second largest element in an arry is:" +" "+ arr[size-2]);
		
	}

}
