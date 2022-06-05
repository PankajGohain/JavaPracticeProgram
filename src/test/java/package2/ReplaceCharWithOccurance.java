package package2;

//https://www.youtube.com/watch?v=Sdi4kQXkZWA&list=PLpLBSl8eY8jQAscb73Z8Auxi3pEWuiUNx&index=6

public class ReplaceCharWithOccurance {

	public static void main(String[] args) {

		String str = "pankajkumargohain";

		char charToReplace = 'a';

		if (str.indexOf(charToReplace) == -1) {
			System.out.println("Character is not present");
			System.exit(0);
		}

		int count = 1;
		for (int i = 0; i < str.length(); i++) {
		//	char ch = str.charAt(i);
			if (str.charAt(i) == charToReplace) {
				str = str.replaceFirst(String.valueOf(str.charAt(i)), String.valueOf(count)); //return the string representation
				count++;
			}

		}
		System.out.println(str);
	}

}
