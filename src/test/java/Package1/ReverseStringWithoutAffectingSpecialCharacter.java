package Package1;

import java.util.Scanner;

public class ReverseStringWithoutAffectingSpecialCharacter {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.nextLine();
        char ch[]=str.toCharArray();
		
		int l=0;
		int r=ch.length-1;
		
		while(l<r){
			
			if(!Character.isAlphabetic(ch[l])){
				l++;
				
			}
			else if(!Character.isAlphabetic(ch[r])){
				r--;
				
			}
			else{
				
				char tempchar=ch[l];
				ch[l]=ch[r];
				ch[r]=tempchar;
				l++;
				r--;
			}
		}
		
		System.out.println(ch);

	}

}
