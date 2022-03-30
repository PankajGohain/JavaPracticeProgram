package Package1;

import java.util.ArrayList;

public class AllPossibleSequence {

	 public static ArrayList<String> al=new ArrayList<String>(); 
	    public static void main(String[] args) { 
	        String s="abcd"; 
	        findsubsequences(s,"");    // Calling a function 
	        System.out.println(al); 
	    } 
	  
	    private static void findsubsequences(String s, String ans) { 
	        if(s.length()==0) 
	        { //System.out.println(s);
	            al.add(ans);  
	            return; 
	        } 
	       //System.out.println(s.substring(1)); 
	     //  System.out.println(ans);
	                //we add adding 1st character in string            
	        findsubsequences(s.substring(1),ans+s.charAt(0)) ; 
	      //  System.out.println(s);
	                
	        findsubsequences(s.substring(1),ans);       
	    } 
	} 


