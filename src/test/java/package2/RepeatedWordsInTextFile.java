package package2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class RepeatedWordsInTextFile {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {

		Map<String, Integer> map = new HashMap<String, Integer>();
		String arrayWord[] = null;
		String fileRead = "";
		BufferedReader rd;
		int count = 0;
		String mostRepeatedWord = null;
			rd = new BufferedReader(
					new FileReader(System.getProperty("user.dir") + "//src//test//java//package2//repeatedWord.txt"));
			while ((fileRead = rd.readLine()) != null) {
				arrayWord = fileRead.toLowerCase().split(" ");
				for (String arr : arrayWord) {
					if (map.containsKey(arr)) {
						map.put(arr, map.get(arr) + 1);
					} else {
						map.put(arr, 1);
					}
				}

			}

		Set<String> s = map.keySet();

		for (String abc : s) {
			System.out.println(abc + "=" + map.get(abc));	
		}

		Set<Entry<String, Integer>> entrySet = map.entrySet();
		for (Entry<String, Integer> entry : entrySet) {
			if (entry.getValue() > count) {
				mostRepeatedWord = entry.getKey();
				count = entry.getValue();
			}
		}
		System.out.println("The most repeated word in input file is : " + mostRepeatedWord);
		System.out.println("Number Of Occurrences : " + count);
	}

}
