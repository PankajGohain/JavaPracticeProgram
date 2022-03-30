package Package1;

import java.util.Scanner;

public class SecondLargest1Sequence {

	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
	String g= sc.nextLine();
	g=g+' ';
	//String g= String.valueOf(s);
		int count=1;
				int countmax=1;
				int countmax1=1;
				int second=Integer.MIN_VALUE;
		//char[] ch= g.toCharArray();
		for (int i = 0; i < g.length()-2; i++) {
			
			if(g.charAt(i)=='1' & g.charAt(i)==g.charAt(i+1) & g.charAt(i+2)!=' ')
			{
				++count;
			}
			else {
				count =1;
			}
			if(count>countmax) {
				countmax=count;
			}
			if (countmax>countmax1) {
				second=countmax1;
				countmax1=countmax;
			}
			System.out.println(second);
		}
		System.out.println("Second largest subsequence of 1 is "  +second);
	}

}
