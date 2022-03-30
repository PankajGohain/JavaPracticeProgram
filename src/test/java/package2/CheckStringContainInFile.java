package package2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//BufferedReader class is used to read the text from a character-based input stream. It can be used to read data line by line by readLine() method.
// FileReader class is used to read data from the file. It returns data in byte format like FileInputStream class.
//It is character-oriented class which is used for file handling in java.

public class CheckStringContainInFile {

	public static void main(String[] args) throws IOException {
		String toCheck = "another";
		String str = "";
		BufferedReader rd = new BufferedReader(
				new FileReader(System.getProperty("user.dir") + "\\src\\Package2\\ReadSentence.txt"));

		while ((str = rd.readLine()) != null) {
			if (str.contains(toCheck)) {
				System.out.println("File contains the string");
			} else {
				System.out.println("File doesn't have the string");
			}
		}

	}

}
