package Package1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SeperateZerosFromNonZeros {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter array elements");
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		
		List<Integer> li1=new ArrayList<>();
		List<Integer> li2=new ArrayList<>();
		
		for(int i=0;i<n;i++){
			
			if(a[i]==0){
				
				li1.add(a[i]);
			}
			
			else
				li2.add(a[i]);
		}
		
		//li1.addAll(li2);
		li2.addAll(li1);
		System.out.println(li2);

	}

}
