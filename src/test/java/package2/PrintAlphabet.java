package package2;

import java.util.ArrayList;
import java.util.List;

public class PrintAlphabet {

	public static void main(String[] args) {

		List<Character> l = new ArrayList<Character>();
		char i;
		for (i = 'a'; i <= 'z'; i++) {
			l.add(i);
		}
		System.out.println(l);
	}

}
