package Package1;

import java.util.Scanner;

public class altPairs {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		
		Integer integer = new Integer(1);
		String s = new String("1");
		int i = 1;
		
		System.out.println(Integer.parseInt(s) == i); //T
		System.out.println(Integer.parseInt(s) == integer); //
		System.out.println(integer == i); //
		System.out.println(s.equals(integer)); //F
	}

}
