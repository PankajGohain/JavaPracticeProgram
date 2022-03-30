package Package1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DuplicateElementsInArray {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the array size");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter array elements");
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		
		Set<Integer> set=new HashSet<Integer>();
		for(int i=0;i<n;i++){
			
			for(int j=i+1;j<n;j++){
				
				if(a[i]==a[j]){
					set.add(a[i]);
				}
		}

	}

		System.out.println("Duplicate elements in an array is:"+set);
}
}
