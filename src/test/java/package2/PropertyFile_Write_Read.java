package package2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFile_Write_Read {

	public static void main(String[] args) throws IOException {

		Properties prop = new Properties();

		// Writing data to properties file
		try {
			FileOutputStream out = new FileOutputStream(
					System.getProperty("user.dir") + "//src//Package2//dataStore.properties");
			prop.setProperty("db.url", "localhost");
			prop.setProperty("db.user", "pankaj");
			prop.setProperty("db.password", "password123");
			prop.setProperty("browser", "Chrome");

			prop.store(out, "Adding some property");
			System.out.println(prop);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Read data from properties file
		FileInputStream fin = new FileInputStream(
				System.getProperty("user.dir") + "//src//Package2//dataStore.properties");
		prop.load(fin);
		System.out.println(prop.getProperty("browser"));
		System.out.println(prop.getProperty("db.password"));

	}

}
