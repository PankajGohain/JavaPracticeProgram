//Given any string, print the character which has occurred most consecutively and number of times. 

package Package1;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String str=sc.nextLine();
		int count=1;
		int count_max=1;
		char ch=str.charAt(0);
		
		for(int i=1;i<str.length();i++){
			
			if(str.charAt(i-1)!=str.charAt(i)){
				
				count=1;
				//continue;
				
			}
			
			else{
				count++;
			}
			
			if(count>count_max){
				count_max=count;
				ch=str.charAt(i);
			}
			
		}
		
		System.out.println(ch+" "+count_max);
	}
}