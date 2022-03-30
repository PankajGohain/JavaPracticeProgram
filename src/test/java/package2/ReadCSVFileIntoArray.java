package package2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadCSVFileIntoArray {

	public static void main(String[] args) {

		String line = "";
		String[] arr;
		try {
			BufferedReader rd = new BufferedReader(
					new FileReader("D:\\Eclipse-project\\JavaProgram\\src\\Package2\\FL_insurance_sample.csv"));
			while ((line = rd.readLine()) != null) {

				arr = line.split(",");
				System.out.println(arr[0] + " " + arr[2]);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();

		}
	}
}
