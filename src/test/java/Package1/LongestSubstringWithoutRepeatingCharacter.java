package Package1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacter {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.nextLine();
		String sub_str="";
		
		for(int i=0;i<str.length();i++){
			
			for(int j=1;j<=str.length()-i;j++){
				
				sub_str=str.substring(i,i+j);
				//System.out.println(sub_str);
				withoutrepeatingcharacter(sub_str);
			}
			
		}

	}

	private static void withoutrepeatingcharacter(String sub_str) {
		
		char ch[]=sub_str.toCharArray();
		Map<Character, Integer> map=new HashMap<>();
		for(int i=0;i<ch.length;i++){
			
			if(map.containsKey(ch[i])){
				int count=map.get(ch[i]);
				map.put(ch[i], ++count);
			}
			else{
				map.put(ch[i],1);
			}
		}
		
		Set<Character> set=map.keySet();
		for(Character ch1:set){
			
			if(map.get(ch1)==1){
				System.out.println(ch1);
			}
		}
		
	}

}
