package Package1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String:");
		String str=sc.nextLine();
		String sub_str="";
		for(int i=0;i<str.length();i++){
			for(int j=1;j<=str.length()-i;j++){
				
				sub_str=str.substring(i, i+j);
			    checksubstring(sub_str);
				
			}
		}

	}

	private static void checksubstring(String sub_str) {
		
		int count=0;
		for(int i=0;i<sub_str.length();i++){
			
			for(int j=i+1;j<sub_str.length();j++){
				
				if(sub_str.charAt(i)==sub_str.charAt(j)){
					
					count++;
					break;
				}
				
				else{
					
					count=0;
				}
			}
		}
		System.out.println(count);
		
	}
}

	