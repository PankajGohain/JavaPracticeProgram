package package2;

public class StringRemoveSpecialCharacters {

	public static void main(String[] args) {

		String str = "pank*&^%ajGoh@#$ain";
		String str1= "Y$%^&GFRefv@#$%^&NGC$%^&8765";
		String newStr = "";
		char arr[] = str.toCharArray();

		for (Character a : arr) {
			if (Character.isAlphabetic(a)) {
				newStr = newStr + a;
			}
		}

		System.out.println(newStr);

		System.out.println(str1.replaceAll("[^a-zA-Z]", ""));

	}

}
