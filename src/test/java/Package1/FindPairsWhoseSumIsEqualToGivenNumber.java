package Package1;

import java.util.Scanner;

public class FindPairsWhoseSumIsEqualToGivenNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=sc.nextInt();
		int a[]=new int[n];
		int sum;
		System.out.println("Enter array elements");
		for(int i=0;i<n;i++){
			
			a[i]=sc.nextInt();
		}
		//System.out.println("Enter the number you want to compare");
		
		for(int i=0;i<n;i++){
			
			sum=sumofNumber(a[i]);
			System.out.println(sum);
			if(sum==a[i]){
				
				System.out.println(sum);
			}
		}
		
		

	}

	private static int sumofNumber(int i) {
		
		int n;
		int temp=0;
		while(i>0){
			
			n=i%10;
			temp=temp+n;
			i=i/10;
			
		}
		
		//System.out.println(temp);
		return temp;
		
	}

}
