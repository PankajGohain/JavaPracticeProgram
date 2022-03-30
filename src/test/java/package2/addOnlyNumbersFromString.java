package package2;

public class addOnlyNumbersFromString {
	public static void main(String Args[]) {

		String s = "abc4ldk5ldl8oro9oo1.35";
		char[] sArray = s.toCharArray();
		int sum = 0;
		int count = 0;

		for (int i = 0; i <= sArray.length - 1; i++) {
			if (Character.isDigit(sArray[i])) {
				count++;
				sum = sum + Character.getNumericValue(sArray[i]);
			}
		}
		System.out.println(sum);
		System.out.println(count);

	}

}
