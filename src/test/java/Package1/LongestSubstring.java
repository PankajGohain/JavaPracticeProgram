package Package1;

import java.util.Scanner;

public class LongestSubstring {

	public static void main (String args[])
	{
		Scanner sc = new Scanner(System.in);
		int max, count1=1;
		int count=1;
		char ch;
		String s= sc.nextLine();
		//char[]d= s.toCharArray();
	for (int i = 0; i <s.length()-1; i++) {
		
		if(s.charAt(i)!=s.charAt(i+1))
       {
	    
		++count;
		
		if (count>=count1)
		{
			count1=count;
			ch=s.charAt(i);
			//int index
			
		}}
		else {
			count=1;
		}
		
		}
	System.out.println("longest non repeating substring "+ count1);	
	}
	

}

