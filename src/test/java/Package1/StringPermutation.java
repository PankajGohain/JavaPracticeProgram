package Package1;

import java.util.Arrays;
import java.util.Scanner;

public class StringPermutation {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String s= sc.nextLine();
		
		char ch;
		int n=s.length();
		/*
		 * char[] ch=s.toCharArray(); int n=ch.length; while(i<n) {
		 * 
		 * ch1= ch[i]; ch[i]=ch[n-1]; ch[n-1]=ch1; ++i; --n; } s=String.valueOf(ch);
		 * 
		 * System.out.println(s);
		 */
		
		for(int i = 0; i < s.length(); i++)
		{
		    s = s.substring(1, s.length() - i) + s.charAt(0) + s.substring(s.length() - i);
		    System.out.println(s);
		}
		System.out.println(s); 


	}

}
