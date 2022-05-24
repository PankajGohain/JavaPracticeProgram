package package2;

import java.util.Arrays;
import java.util.HashSet;

public class StringReverseWordInPlace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "This is an easy Java Program";
		String arr[] = str.split(" ");

		String newStr = "";

		for (String s : arr) {
			StringBuilder sb = new StringBuilder(s);
			sb.reverse();
			newStr = newStr + sb + " ";
		}

		System.out.println(newStr);
	}
}
