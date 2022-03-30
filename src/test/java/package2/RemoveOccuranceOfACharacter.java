package package2;

public class RemoveOccuranceOfACharacter {

	public static void main(String[] args) {

		String str = "abcdABCDabcdABCD";
		String newStr = "";
		char arr[] = str.toCharArray();

		for (char c : arr) {
			if (c != 'a' && c != 'A') {
				newStr = newStr + c;
			}
		}
		System.out.println(newStr);

	}

}
