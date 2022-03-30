package Package1;

//EXPLANATION: https://www.youtube.com/watch?v=hXEEr5WekSQ

public class removeAllAdjacentDuplicates {

	public String removeDuplicate(String str) {

		char[] stack = new char[str.length()];
		int i = 0;

		for (int j = 0; j < str.length(); j++) {

			char current_char = str.charAt(j);

			if (i > 0 && stack[i - 1] == current_char) {
				i--;
			} else {
				stack[i] = current_char;
				i += 1;

			}
		}

		return new String(stack, 0, i);
	}

}
