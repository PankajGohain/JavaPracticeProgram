package Package1;

import java.util.Scanner;

public class stringMatch {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first string");
		String str1=sc.nextLine();
		System.out.println("Enter the second string");
		String str2=sc.nextLine();
		int count=0;
		int length=Math.min(str1.length(), str2.length());
		
		
		for(int i=0;i<=length-1;i++){
			
			String str1b=str1.substring(i, i+2);
			String str2b=str2.substring(i, i+2);
			if(str1b.equals(str2b)){
				count++;
			}
		}
		
		System.out.println(count);

	}

}
