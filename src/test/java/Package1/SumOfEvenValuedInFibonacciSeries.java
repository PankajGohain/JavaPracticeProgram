package Package1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumOfEvenValuedInFibonacciSeries {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the lenght upto you want the series");
		int n=sc.nextInt();
		List<Integer> li=new ArrayList<>();
		int n1=0, n2=1, n3;
		int sum=0;
		li.add(n1);
		li.add(n2);
		for(int i=2;i<n;i++){
			n3=n1+n2;
			n1=n2;
			n2=n3;
			
			if(n3<4000)
			li.add(n3);
			
		}
		
		System.out.println("Fibonacci terms which are less then four million are: "+ li);
		for(int i=0;i<li.size();i++){
			
			if(li.get(i)%2==0){
				
				sum=sum+li.get(i);
			}
		}
		
		System.out.println("Sum of even valued terms is: " +sum);
		
	}

}
