package package2;

import java.util.ArrayList;
import java.util.List;

public class ProcessBuilderOSCommand {

	public static void main(String[] args) {

		// creating list of process
		List<String> list = new ArrayList<String>();
		list.add("notepad.exe");
		list.add("xyz.txt");

		// create the process
		ProcessBuilder build = new ProcessBuilder(list);

		// checking the command in list
		System.out.println("command: " + build.command());
		build.command("cmd.exe");

	}

}
