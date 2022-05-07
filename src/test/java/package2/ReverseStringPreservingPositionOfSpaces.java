package package2;

public class ReverseStringPreservingPositionOfSpaces {
	static void reverseString(String inputString) {
		// Converting inputString to char array 'inputStringArray'

		char[] arr = inputString.toCharArray();
		char[] resultArray = new char[arr.length];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == ' ') {
				resultArray[i] = ' ';
			}
		}

		// Initializing 'j' with length of resultArray
		int j = resultArray.length - 1;  //so that it will iterate from end

		// Second for loop :
		// we copy every non-space character of inputStringArray
		// from first to last at 'j' position of resultArray

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != ' ') {
				// If resultArray already has space at index j then decrementing 'j'
				if (resultArray[j] == ' ') {
					j--;
				}

				resultArray[j] = arr[i];

				j--;
			}
		}

		System.out.println(inputString + " ---> " + String.valueOf(resultArray));
	}

	public static void main(String[] args) {
		reverseString("I Am Not String");

		reverseString("JAVA JSP ANDROID");

		reverseString("1 22 333 4444 55555");
	}
}