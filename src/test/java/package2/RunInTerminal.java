package package2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RunInTerminal {

	public static void main(String[] args) throws IOException, InterruptedException {

		String command = "ping 3 www.google.com";
		Process proc = Runtime.getRuntime().exec(command);
		BufferedReader reader = new BufferedReader(new InputStreamReader(proc.getInputStream()));

		String line = "";
		while ((line = reader.readLine()) != null) {
			System.out.print(line + "\n");
		}

		proc.waitFor();

	}

}
