package package2;

import java.util.ArrayList;

public class lambdaExp {

	public static void main(String[] args) {
		 ArrayList<String> list=new ArrayList<String>();  
	        list.add("ankit");  
	        list.add("mayank");  
	        list.add("irfan");  
	        list.add("jai"); 
	        
	        list.forEach(n->System.out.println(n));
	        
	}

}
