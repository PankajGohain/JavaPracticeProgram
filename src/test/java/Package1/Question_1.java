package Package1;

import java.util.Scanner;

public class Question_1 {
	
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String str=sc.nextLine();
		int count=1;
		int count_max=1;
		char ch=str.charAt(0);
		
		for(int i=0;i<str.length()-1;i++){
			
			if(str.charAt(i)==str.charAt(i+1)){
				
				count++;
				//continue;
				
			}
			
			else{
				count=1;
			}
			
			if(count>count_max){
				count_max=count;
				ch=str.charAt(i);
			}
			
		}
		
		System.out.println(ch+" "+count_max);
	}


}
