//Given a string and a non-empty word string, return a version of the original String where all chars have been replaced by pluses (�+�), except for appearances of the word string which are preserved unchanged.

package Package1;

import java.util.Scanner;

public class PlusOutProblem {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.nextLine();
		System.out.println("Enter the word string");
		String word=sc.nextLine();
		String new_string=plusout(str,word);
		System.out.println("New String is:"+" " +new_string);
	}

	private static String plusout(String str, String word) {
		
		String res="";
		int i=0;
		while(i<str.length()){
			
			if(str.substring(i).startsWith(word)){
				
				res=res+word;
				i=i+word.length();
			}
			
			else{
				
				res=res+"+";
				i++;
			}
		}
		
		return res;
	}

}
