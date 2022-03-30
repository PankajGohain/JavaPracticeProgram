package Package1;

import java.util.Scanner;

public class ReverseStringRecursive {
	
	public static void main(String args[])
	{
		Scanner sc =new Scanner (System.in);
		String s= sc.nextLine();
		System.out.println(recursive(s));
	}

	public static String recursive(String s)
	{
		if (s.length()<2)
		{
			return s;
		}
		else
		{
			return recursive(s.substring(1))+s.charAt(0);
		}
	}
}
