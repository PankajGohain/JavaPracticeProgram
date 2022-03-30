package Package1;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		//Input : 153
		//Output : Yes
		//153 is an Armstrong number.
		//1*1*1 + 5*5*5 + 3*3*3 = 153
		
		int n, remainder, org, result = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number you want to check");
		n=sc.nextInt();
		org=n;
		
		while (n!=0){
			
			remainder=n%10;
			System.out.println(remainder);
			result=result+remainder*remainder*remainder;
			n=n/10;
			System.out.println(n);
			
		}

		if(org==result){
			
			System.out.println("Number is Armstrong number");
		}
		else{
			System.out.println("Number is not Armstrong number");
		}
	}

}
