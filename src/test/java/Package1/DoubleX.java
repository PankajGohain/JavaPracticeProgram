package Package1;

import java.util.Scanner;

public class DoubleX {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.nextLine();
		char ch[]=str.toCharArray();
		
		boolean b=doubleX(str);
		System.out.println(b);
		}
		
	

	private static boolean doubleX(String str) {
		
		String x = "";
		for(int i=0;i<str.length();i++){
			
			x=str.substring(i);
			//System.out.println(x);
			return x.startsWith("xx");
		}
		return true;
		
		
		
	}

	
	}


