package Package1;

import java.util.Scanner;

public class CountXX {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.nextLine();
		char ch[]=str.toCharArray();
		int count=0;
		for(int i=0;i<ch.length-1;i++){
			
			if(ch[i]=='x'&&ch[i+1]=='x'){
				
				count++;
				
			}
			
			else{
				count=0;
			}
			
			
		}
		System.out.println(count);
		

	}

}
