package package2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReadSenFromFileANDWriteInAnotherInSorted {

	public static void main(String[] args) throws IOException {

		String fileRead = "";
		String toSort[] = null;
		try {
			BufferedReader rd = new BufferedReader(
					new FileReader(System.getProperty("user.dir") + "\\src\\Package2\\ReadSentence.txt"));
			while ((fileRead = rd.readLine()) != null) {
				toSort = fileRead.toLowerCase().split(" ");
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		/*
		 * List<String> arr = Arrays.asList(toSort); Collections.sort(arr);
		 * System.out.println(arr);
		 */
		
		Arrays.sort(toSort);
		System.out.println(Arrays.toString(toSort));

		FileWriter fw = new FileWriter(System.getProperty("user.dir") + "\\src\\Package2\\WriteSentenceSorted.txt");
		for (String abc : toSort) {
			fw.write(abc + " ");
		}
		fw.close();

	}

}
