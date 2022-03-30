package package2;

public class ReverseSentence {

	public static void main(String[] args) {

		String str = "Pankaj Kumar Gohain";
		String arr[]=str.split(" "); // or just split("\\s")
		String rev = "";
	
		for (int i = arr.length - 1; i >= 0; i--) {

			rev = rev + arr[i] + " ";
		}

		System.out.println(rev);

	}

}
