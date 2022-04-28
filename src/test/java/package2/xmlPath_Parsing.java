package package2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import io.restassured.path.xml.XmlPath;

public class xmlPath_Parsing {

	public static void main(String[] args) throws IOException {

		String demoXML=new String(Files.readAllBytes(Paths.get(System.getProperty("user.dir")+"\\src\\test\\java\\package2\\microsoftSample.xml")));
		
		System.out.println(demoXML);
		
		XmlPath xpath=new XmlPath(demoXML);
		
		System.out.println(xpath.getString("catalog.book[0].author"));
		System.out.println(xpath.getString("catalog.book[0].@id"));
		System.out.println(xpath.getList("catalog.book[0].price"));
	}

}
	