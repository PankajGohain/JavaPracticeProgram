package package2;

public class StringReverseInterval {

	public static void main(String[] args) {

		String str = "Hello Good Morning";
		StringBuffer sb1 = new StringBuffer();// to store reverse string
		String newS = "";
		int interval = 3;
		int length = str.length();
		for (int i = 0; i < length; i = i + interval) {
			String s1 = str.substring(i, i + interval);
			StringBuffer rs1 = new StringBuffer(s1);
			rs1.reverse();
			sb1.append(rs1);
			newS=newS+rs1;
		}
		System.out.println("Reverse of sb is:" + sb1);
		System.out.println(newS);
	}

}
