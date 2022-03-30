package Package1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LongestPalindrome {

	static int count_max=0;
	static String ss="";
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.nextLine();
		String sub="";
		
		for(int i=0;i<str.length();i++){
			
			for(int j=1;j<=str.length()-i; j++){
				
				sub=str.substring(i, i+j);
				longestpalindrome(sub);
		
			}
			
		}
		System.out.println("Longest palindromic substring is:");
		System.out.println(ss+" "+count_max);
	}

	private static void longestpalindrome(String sub) {
		
		String rev="";
	//	Map<String, Integer> map=new HashMap<>();
		for(int i=sub.length()-1;i>=0;i--){
			
			rev+=sub.charAt(i);
				
		}				
		
//		if(rev.equals(sub)){
//			
//			map.put(rev, rev.length());
//			
//			for(int j=0;j<map.size();j++){
//			if(map.get(rev)>count_max){
//				
//				count_max=map.get(rev);
//				ss=rev;
//			}
//	
//		else{
//			
//				continue;
//			}
//	      }
		//}
		
		if(rev.equals(sub)){
			
			if(rev.length()>count_max){
				count_max=sub.length();
				ss=rev;
			}
			
		}
		
	}
}

		
	   
	
	
