package Package1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;

public class AppendStringToTextFile {

	public static void main(String[] args) {
		
		FileWriter filewriter=null;
		BufferedWriter bufferedwriter=null;
		BufferedReader buffread=null;
		PrintWriter printwriter=null;
		FileReader file=null;
		
		try{
			filewriter=new FileWriter("//home//qainfotech//eclipse-workspace//Programming//src//filewriitestring.txt",false);
			bufferedwriter= new BufferedWriter(filewriter);
			printwriter= new PrintWriter(bufferedwriter);
			bufferedwriter.write("3423543");
			bufferedwriter.newLine();
			bufferedwriter.write("the bhakuni jjjj");
			//printwriter.close();
        	bufferedwriter.close();
        	//filewriter.close();
			
			
			file= new FileReader("//home//qainfotech//eclipse-workspace//Programming//src//filewriitestring.txt");
			buffread= new BufferedReader(file);
			String line = buffread.readLine();
            while(line != null){
                System.out.println(line);
                line = buffread.readLine();
            }

//Read more: https://javarevisited.blogspot.com/2012/07/read-file-line-by-line-java-example-scanner.html#ixzz67nPKYlMbwhile()
			
			
//			printwriter.println();
//			printwriter.println("ABC: 12345");
//			printwriter.println("XYZ: 56789");
//			printwriter.println("IJK: 9090");
			System.out.println("Done");
		}
		catch(IOException e){
			
			e.printStackTrace();
		}
		finally
        {
        }

	}

}
