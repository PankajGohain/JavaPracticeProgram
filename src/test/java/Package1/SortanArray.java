package Package1;

import java.util.Scanner;

public class SortanArray {

	public static void main(String[] args) {
		
        int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements in an array");
		n=sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter all the elements");
		for(int i=0;i<n;i++){
			
			arr[i]=sc.nextInt();
		}
		
		sort(arr);
	}

	public static void sort(int[] arr) {
		
		int size, temp=0;
		size=arr.length;
		
		for(int i=0;i<size;i++){
			
			for (int j=1;j<size-i;j++){
				
				if(arr[j-1]>arr[j]){
					
					temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		System.out.println("Sorted array is:");
           for(int i=0;i<size;i++){
			
		   System.out.println(arr[i]);
		}
		
	}

}
