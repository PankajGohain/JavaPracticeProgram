package Package1;

import java.util.Scanner;

public class FactorialProgramRecursion {

	public static void main(String[] args) {
	
    Scanner sc= new Scanner(System.in);
    int f= sc.nextInt();
   System.out.println(fact(f)); 
	

	}
	public static int fact(int f)
	{
	if(f>1)
	{
		return f*fact(f-1);
	}
	else
	{
	return 1;

}}}
