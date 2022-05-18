package package2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class propertyFileToMap {

//	final static String filePath = System.getProperty("user.dir") + "\\src\\test\\java\\package2\\propToMap.properties";
	final static String filePath = System.getProperty("user.dir") + "\\src\\test\\java\\package2\\dataStore.properties";

	public static void main(String[] args) throws IOException {

		Map<String, String> mapFromFile = HashMapFromTextFile();
		for (Map.Entry<String, String> entry : mapFromFile.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}

		System.out.println(mapFromFile.get("db.user"));
	}

	public static Map<String, String> HashMapFromTextFile() throws IOException {

		Map<String, String> map = new HashMap<String, String>();

		BufferedReader br = null;
		File file = new File(filePath);
		br = new BufferedReader(new FileReader(file));
		String line = null;
		while ((line = br.readLine()) != null) {

			// split the line by :
			String[] parts = line.split("=");

			// first part is name, second is number
			String key = parts[0].trim();
			String value = parts[1].trim();

			// put name, number in HashMap if they are not empty
			if (!key.equals("") && !value.equals(""))
				map.put(key, value);

		}
		return map;
	}
}