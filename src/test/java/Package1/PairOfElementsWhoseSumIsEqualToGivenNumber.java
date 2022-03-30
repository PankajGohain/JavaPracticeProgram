package Package1;

import java.util.Scanner;

public class PairOfElementsWhoseSumIsEqualToGivenNumber {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter array elements");
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the number which needs to be compared with sum of elements");
		int num=sc.nextInt();
		
		for(int i=0;i<n;i++){
			
			for(int j=i+1;j<n;j++){
				
				if(a[i]+a[j]==num){
					
					System.out.println(a[i]+"+"+a[j]+"="+num);
				}
			}
		}

	}

}
