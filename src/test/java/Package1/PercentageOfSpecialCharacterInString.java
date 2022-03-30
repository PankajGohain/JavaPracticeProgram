package Package1;

import java.util.Scanner;

public class PercentageOfSpecialCharacterInString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.nextLine();
		char ch[]=str.toCharArray();
		int uppercase=0;
		int lowercase=0;
		int digit=0;
		int specialcase=0;
		
		for(int i=0;i<ch.length;i++){
			
			if(Character.isUpperCase(ch[i])){
				
				uppercase++;
			}
			
			else if(Character.isLowerCase(ch[i])){
				
				lowercase++;
			}
			
			else if(Character.isDigit(ch[i])){
				
				digit++;
			}
			
			else 
				specialcase++;
				
		}
		
		double uppercasepercentage=(uppercase*100.0)/ch.length;
		System.out.println("Percentage of Uppercase characters is: "+uppercasepercentage+"%");
		double lowercasepercentage=(lowercase*100.0)/ch.length;
		System.out.println("Percentage of Lowercase character is: "+lowercasepercentage+"%");
		double digitpercentage=(digit*100.0)/ch.length;
		System.out.println("Percentage of digits is: "+digitpercentage+"%");
		double specialcasepercentage =(specialcase*100.0)/ch.length;
		System.out.println("Percentage of special character is: "+specialcasepercentage+"%");
	}

}
