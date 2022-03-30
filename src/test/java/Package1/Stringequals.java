package Package1;

public class Stringequals {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		
		String s1="ABC";
		StringBuilder sb= new StringBuilder("ABC");
		System.out.println(s1.equals(sb));
		System.out.println(sb.equals(s1)+ " "+s1.equals(sb));

	}

}
