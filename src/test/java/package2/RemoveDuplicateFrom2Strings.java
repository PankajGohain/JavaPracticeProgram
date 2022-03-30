package package2;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateFrom2Strings {

	public static void main(String[] args) {

		String s1 = "pankajkumargohain";
		String s2 = "mohitesh";
		
		String s3=s1.concat(s2);
		System.out.println(s3);
		String commonChars = "";
		
		  for (int i = 0; i < s1.length(); i++) {
	            for (int j = 0; j < s2.length(); j++) {
	                if (s1.charAt(i) == s2.charAt(j))
	                {
	                    commonChars += s1.charAt(i);
	                }
	            }
	        }
		  System.out.println(commonChars);
		  
		  for(int i = 0; i < commonChars.length(); i++) {
	            String charToRemove = commonChars.charAt(i)+"";
	            s1 = s1.replace(charToRemove, "");
	            s2 = s2.replace(charToRemove, "");
	        }
	        System.out.println("After removing common character " + s1.concat(s2));
	}

}
