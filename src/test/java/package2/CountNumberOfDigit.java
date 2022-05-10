package package2;

public class CountNumberOfDigit {

	public static void main(String[] args) {

		int num = 234567;
		int count = 0;
		while (num > 0) {
			num = num / 10;  //23456, 2345,234,23,2,0
			count++;
		}
		
		System.out.println("Number of digit: "+count);
	}

}
