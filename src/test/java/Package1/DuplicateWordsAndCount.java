package Package1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class DuplicateWordsAndCount {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.nextLine();
		String[] str_arr=str.split(" ");
		Map<String, Integer> map=new HashMap<>();
		
		for(int i=0;i<str_arr.length;i++){
			
			if(map.containsKey(str_arr[i].toLowerCase())){
				
				int count=map.get(str_arr[i].toLowerCase());
				map.put(str_arr[i].toLowerCase(), ++count);
			}
			else{
				map.put(str_arr[i].toLowerCase(), 1);
			}
		}
	
		
		Set<String> set=map.keySet();
		
		for(String s:set){
			
			if(map.get(s)>1){
				
				System.out.println(s+": "+map.get(s));
			}
		}
		
		

	}

}
