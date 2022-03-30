package Package1;

public class newclass {

	public static void main(String[] args) {
		System.out.println(method("qwerty"));

	}

	public static String method(String s) {

		if (s.equals("qwerty")) {
			return "new";
		} 
		else if (s.equals("qazx")) {
			return "okk";

		}
		return null;
	}

}
