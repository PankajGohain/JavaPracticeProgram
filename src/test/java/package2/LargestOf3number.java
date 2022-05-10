package package2;

public class LargestOf3number {

	public static void main(String[] args) {

		int a = 10;
		int b = 45;
		int c = 89;

		int largest = a > b ? a : b;
		largest = c > largest ? c : largest;

		System.out.println("Largest Number is: "+largest);
	}

}
