package package2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class PropertiesToHashMap {

	public static void main(String[] args) throws FileNotFoundException, IOException {

		final String filePath = System.getProperty("user.dir") + "\\src\\test\\java\\package2\\dataStore.properties";

		Properties prop = new Properties();
		prop.load(new FileInputStream(new File(filePath)));

		Map<String, String> propToMap = new LinkedHashMap<String, String>();

		Set<String> propKey=prop.stringPropertyNames();
		for (String Key : propKey) {
			propToMap.put(Key, prop.get(Key).toString());
		}

		System.out.println(propToMap);
	}

}
