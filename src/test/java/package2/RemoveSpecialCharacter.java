package package2;

public class RemoveSpecialCharacter {

	public static void main(String[] args) {

		String str = "Happy%Christmas%%&45&&A@New^^$#@";
		String str1[] = str.replaceAll("[^a-zA-Z0-9]", " ").split(" ");
		System.out.println("After removing special characte:" + str1);
		int temp = 0;
		String longestWord = "";
		for (int i = 0; i < str1.length; i++) {
			if (temp < str1[i].length()) {
				temp = str1[i].length();
				longestWord = str1[i];
			}
		}
		System.out.println(longestWord + " is the largest word with " + temp + " characters");
	}
}
	