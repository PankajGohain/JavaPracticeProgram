package Package1;

import java.util.Scanner;

public class DuplicateCharacter {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string");
		String s = sc.nextLine();
		int count=0;
		char[] ch=s.toCharArray();
		for(int i=0;i<s.length()-1;i++){
			
			for(int j=i+1;j<s.length();j++){
			
				if(s.charAt(i)==s.charAt(j)){
			
					count++;
				if(count==1){
					System.out.println(s.charAt(i));
					break;
				}
				
		
				}
			}
			
			
			String d = String.valueOf(s.charAt(i)).trim();
			
			s=s.replaceAll(d, "");
			
//			if(count>0){
//				
//				System.out.println(ch[i]);
//			}
			
			count=0;
		}
		
		

	}

}
