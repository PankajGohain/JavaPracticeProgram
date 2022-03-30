package Package1;

import java.util.Scanner;

public class stringYak {

	public static void main(String[] args) {
    
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the string");
		 String str=sc.nextLine();
		 String result="";
		 int i=1;
		 String result1="";
		 
		 if(str.startsWith("yak")){
			 result=result+str.substring(3);
		 }
		 
		 while(i<str.length()-3)
		 {
			 
			 if(str.substring(i).startsWith("yak")){
				 
				 result=result+str.substring(0, i)+str.charAt(i+3);
				 
				 i+=3;
			 }
			 
			 else{
				 i++;
			 }
		 }
		 
		 if(str.substring(str.length()-3).startsWith("yak")){
			 result=result+str.substring(str.length()-3-1);
		 }
		 
		System.out.println(result);
	}

}
