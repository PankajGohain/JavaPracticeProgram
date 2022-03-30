package Package1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicatesFromSortedArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of an array");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the array elements");
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		
		Set<Integer> set=new HashSet<>();
		
		for(int i=0;i<n;i++){
			
			set.add(a[i]);
		}
		System.out.println("Array after removing duplicate elements:");
        Iterator<Integer> itr=set.iterator();
        while(itr.hasNext()){
        	
        	System.out.println(itr.next());
        }
	}

}
