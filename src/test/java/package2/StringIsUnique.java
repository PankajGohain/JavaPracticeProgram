package package2;

import java.util.Arrays;

//The lastIndexOf() method returns the position of the last occurrence of specified character(s) in a string.

//Tip: Use the indexOf method to return the position of the first occurrence of specified character(s) in a string.

public class StringIsUnique {

	public static void main(String[] args) {

		int count = 0;
		String s = "pankabbj";
		char a[] = s.toCharArray();
		// Arrays.sort(a);
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					count = count + 1;
				}
			}													//Time complexity: O(n)
		}

		System.out.println(count);
		if (count > 0) {
			System.out.println("String is not unique");
		} else {
			System.out.println("String is unique");
		}
	}}



//better use set & compare the length of string & size of set.

/*
 * HashSet<Character> char_set = new HashSet<>();
 * 
 * // Inserting character of String into set 
 * for(int c = 0;c<str.length();c++) {
 * char_set.add(str.charAt(c)); }
 * 
 * // If length of set is equal to len of String // then it will have unique
 * characters 
 * if(char_set.size()==str.length()) 
 * { return true; }
 * else { return
 * false; }
 */