package package2;

//convert String to character array by using toCharArray

public class ReverseString {

	public static void main(String[] args) {
		String input = "spoon";

		char[] arr = input.toCharArray();
		String rev = "";

		for (int i = arr.length - 1; i >= 0; i--) {
			rev = rev + arr[i];
		}

		System.out.println("Reverse string is:" + rev);

		// String compare = String.copyValueOf(try1);

		if (input.equalsIgnoreCase(rev)) {
			System.out.println("String is reverse");
		} else {
			System.out.println("String is not reverse");
		}
	}

}
