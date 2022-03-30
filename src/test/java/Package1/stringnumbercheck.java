package Package1;

import java.util.regex.Pattern;

public class stringnumbercheck {
	
	public static void main(String args[]) {
	     
        // Regular expression in Java to check if String is number or not
        Pattern pattern = Pattern.compile(".*[^0-9].*");
       //Pattern pattern = Pattern.compile(".*\\D.*");
       String [] inputs = {"123", "-123" , "123.12", "abcd123"};
     
       for(String input: inputs){
           System.out.println( "does " + input + " is number : "
                                + !pattern.matcher(input).matches());
       }



}}
