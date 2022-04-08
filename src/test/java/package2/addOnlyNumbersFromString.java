package package2;

public class addOnlyNumbersFromString {
	public static void main(String Args[]) {

		String s = "abc4ldk5ldl8oro9oo1.35";
		char[] sArray = s.toCharArray();
		int sum = 0;
		int count = 0;

		for (Character a : sArray) {
			if (Character.isDigit(a)) {
				count++;
				sum = sum + Character.getNumericValue(a);
			}
		}
		System.out.println(sum);
		System.out.println(count);

	}

}
