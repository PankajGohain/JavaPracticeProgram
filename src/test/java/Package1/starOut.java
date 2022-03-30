package Package1;

import java.util.Scanner;

public class starOut {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.nextLine();
		String res="";
		char[] ch=str.toCharArray();
		for(int i=0;i<str.length();i++){
			
			if(ch[i]=='*'){
				
				//ch[i-1]='0';
				//ch[i+1]='0';
				
				
			}
			
			else if(i!=0&&ch[i-1]=='*'){
				
			}
			
			else if(i!=str.length()-1&&ch[i+1]=='*'){
				
			}
			else{
			
			res=res+ch[i];
			}
		}
		
	
		System.out.println(res);
		
	}

	

}
