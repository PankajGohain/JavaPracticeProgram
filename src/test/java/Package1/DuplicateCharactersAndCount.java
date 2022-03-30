 package Package1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class DuplicateCharactersAndCount {

	public static void main(String[] args) {
			
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.nextLine();
		char ch[]=str.toCharArray();
		Map<Character,Integer> map=new HashMap<>();
		
		for(int i=0;i<ch.length;i++){
			
			if(map.containsKey(ch[i])){
				
				int count=map.get(ch[i]);
				map.put(ch[i], count+1);
			}
			else{
				map.put(ch[i], 1);
			}
		}
		
		
		Set<Character> set=map.keySet();
		
		for(Character ch1:set){
			//if(map.get(ch1)>1)
			if(map.get(ch1)>=0){
				System.out.println(ch1+" : "+map.get(ch1));
			}
		}

	}

}

//This function prints the first repeated 
// character in str[] 
/*static char firstRepeating(char str[]) 
{ 
    // Creates an empty hashset 
    HashSet<Character> h = new HashSet<>(); 

    // Traverse the input array from left to right 
    for (int i=0; i<=str.length-1; i++) 
    { 
        char c = str[i]; 

        // If element is already in hash set, update x 
        // and then break 
        if (h.contains(c)) 
            return c; 

        else // Else add element to hash set 
            h.add(c); 
    } 

    return '\0'; 
} */