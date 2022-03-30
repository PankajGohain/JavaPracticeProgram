package package2;

import java.util.Scanner;

public class AddNumberInString {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner("ab50dt60h4q");
		int sum = 0;
		sc.useDelimiter("\\D+");
		while(sc.hasNext()) {
		sum+=Integer.parseInt(sc.next());
		}
		System.out.println(sum);
	}

}
