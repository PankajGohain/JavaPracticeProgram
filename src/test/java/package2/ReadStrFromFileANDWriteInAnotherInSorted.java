package package2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class ReadStrFromFileANDWriteInAnotherInSorted {

	public static void main(String[] args) throws IOException {

		char toSort[]=null;
		String fileRead;
		
		BufferedReader rd=new BufferedReader(new FileReader(System.getProperty("user.dir")+"\\src\\Package2\\ReadString.txt"));
		
		while((fileRead=rd.readLine())!=null) {
			toSort=fileRead.toCharArray();
		}
		
		Arrays.sort(toSort);
		System.out.println(toSort);
		
		FileWriter fw=new FileWriter(System.getProperty("user.dir")+"\\src\\Package2\\WriteSortedString.txt");
		fw.write(toSort);
		fw.close();
	}

}
