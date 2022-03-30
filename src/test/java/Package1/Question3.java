//Given a string and a non-empty word string, return a string made of each char just before and just after every appearance of the word in the string. Ignore cases where there is no char before or after the word, and a char may be included twice if it is between two words. 

package Package1;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.nextLine();
		System.out.println("Enter the word string");
		String word=sc.nextLine();
		String new_string=wordEnds(str,word);
		System.out.println("New String is:"+" "+new_string);
	}

	private static String wordEnds(String str, String word) {
		
		String rev="";
		if(word.equals(str)){
			return rev;
		}
		
		if(str.startsWith(str)){
			rev=rev+str.charAt(word.length());
		}
		
		int i=1;
		
		while(i<str.length()-word.length()){
			
			if(str.substring(i).startsWith(word)){
				
				rev=rev+str.charAt(i-1)+str.charAt(i+word.length());
				i=i+word.length();
			}
			
			else{
				
				i++;
			}
		}
		
		if(str.endsWith(word)){
			rev=rev+str.charAt(str.length()-word.length()-1);
		}
		
		return rev;
	}

}
