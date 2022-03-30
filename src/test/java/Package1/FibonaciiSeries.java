package Package1;

import java.util.Scanner;

public class FibonaciiSeries {

	public static void main(String[] args) {
		
		int n1=0, n2=1, n3 = 0, n;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number upto you wannt Fibonacci series");
		n=sc.nextInt();
		
		System.out.println("First number of fibonacci series is:" +n1);
		System.out.println("Second number of fibonacci series is:" +n2);
		
		for(int i=2;i<=n;i++){
			
			n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.println(n3);
			
		}
		
		

	}

}
