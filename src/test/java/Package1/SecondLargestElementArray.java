package Package1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SecondLargestElementArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter array elements");
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		
		List<Integer> list=new ArrayList<>();
		for(int i=0;i<n;i++){
			list.add(a[i]);
		}
		Collections.sort(list);
		System.out.println("Seond largest element in an array is:"+list.get(list.size()-2));

	}

}
