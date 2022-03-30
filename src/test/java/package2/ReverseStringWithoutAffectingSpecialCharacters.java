package package2;

public class ReverseStringWithoutAffectingSpecialCharacters {

	public static void main(String[] args) {

		String str = "a!!!b.c.d,e'f,ghi";
		// String str = "a,b$c";
		char arr[] = str.toCharArray();

		int left = 0;
		int right = arr.length - 1;

		while (left < right) {
			if (!Character.isAlphabetic(arr[left]))
				left++;
			else if (!Character.isAlphabetic(arr[right]))
				right--;
			else {
				char temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left++;
				right--;
			}

		}
		System.out.println(arr);

	}

}
