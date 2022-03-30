package Package1;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MostRepeatedWordInTextFile {

	public static void main(String[] args) {
		
		
		int count_max=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.nextLine();
		String[] str_arr=str.split("\\s");
		List<String> res = new ArrayList<String>();
		int m=0;
		
		Map<String,Integer> map= new HashMap<>();
		
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
	  
	  for(String s: set){
		  
		  if(map.get(s)>1){
			  
			  if(map.get(s)>=count_max) {
				  
				  count_max=map.get(s);
				  res.add(s);
				//  ++m;
			  }
		  }
	  }
	  int k= res.size();
	  
	  if(count_max>1 & res.size()==1) {
		  
		  System.out.println("Most Repeated Word in file is: "+res.get(0)+" "+count_max);  
	  }
	  if (count_max>1 & res.size()>1) {
		  
			  if(map.get(res.get(k-1))!=map.get(res.get(0))){
					  
    System.out.println("Most Repeated Word in file is: "+res.get(k-1)+" "+count_max);
    }
			  else{
				  System.out.println("Most Repeated Word in file are more that one and they are mentioned below :");			  
				  for(int n=0; n<res.size(); n++) {
  System.out.println(res.get(n)+" "+count_max);
			  }}}
	
	else {
		System.out.println("All word are unique and non repeating");
	}

}}
