package package2;

public class StringReverseWordInMyString {

	public static void main(String[] args) {

		String str = "This is an easy Java Program";
		String[] words = str.split(" "); // or \\s
		String reversedString = "";
		for (int i = 0; i < words.length; i++) {
			String wordToRev = words[i];
			String reverseWord = "";
			for (int j = wordToRev.length() - 1; j >= 0; j--) {
				/*
				 * The charAt() function returns the character at the given position in a string
				 */
				reverseWord = reverseWord + wordToRev.charAt(j);
			}
			reversedString = reversedString + reverseWord + " ";
		}
		System.out.println("Original String:" + str);
		System.out.println("Reverse String:" + reversedString);

	}
}

//Approach 2

/*
 * for(String w:words) { StringBuilder sb=new StringBuilder(w); sb.reverse();
 * reversedString=reversedString+sb.toString()+ " "; }
 * 
 * System.out.println(reversedString);
 */