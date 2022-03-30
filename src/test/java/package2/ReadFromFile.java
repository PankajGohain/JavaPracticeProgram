package package2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFromFile {

//	https://www.youtube.com/watch?v=lHFlAYaNfdo
	
	public static void main(String[] args) {
		Scanner sc = null;
		String s1 = null;
		String s2 = null;

		try {
			sc = new Scanner(new File("D:\\Eclipse-project\\JavaProgram\\src\\Package2\\sample.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		while (sc.hasNext()) {
			s1 = sc.nextLine();
			s2 = sc.nextLine();
		}

		System.out.println(s1);
		System.out.println(s2);
	}

}
