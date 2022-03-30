//Write a java program to find out the binary equivalent of a decimal number 

package Package1;
import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		
		int a[]=new int[90];
		int index=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the decimal number");
		int n=sc.nextInt();
		while(n>0){
			
			a[index++]=n%2;
			n=n/2;
		}
		
		System.out.print("Binary equivalent of a number is: ");
		
		for(int i=index-1;i>=0;i--){
			
			System.out.print(a[i]);
		}

	}

}
