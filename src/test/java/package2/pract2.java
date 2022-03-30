package package2;

public class pract2 {

	public static void main(String[] args) {

		String str1 = "ABCDABCD";
		String result1 = "";

		for (int a = 0; a <= str1.length() - 1; a++) {
			if (result1.contains("" + str1.charAt(a))) {
				// If the string result does not contains str.CharAt(i),
				// then we concate it to the result. if it does we will not
				continue;
			}
			result1 += str1.charAt(a);
		}
		System.out.println(result1);

	}

}
