package package2.Demo_API;

import java.io.IOException;

import org.apache.juneau.json.JsonParser;
import org.apache.juneau.json.JsonSerializer;
import org.apache.juneau.parser.ParseException;
import org.apache.juneau.serializer.SerializeException;
import org.apache.juneau.xml.XmlSerializer;
import org.testng.annotations.Test;

public class demoJuneao {

	@Test
	public void POJOtoJSON_XML() throws SerializeException {
		// POJO to Json

		JsonSerializer jsonSer = JsonSerializer.DEFAULT_READABLE;
		String sellernames[] = { "ABC", "DEF", "XYZ" };
		ProductPOJO product = new ProductPOJO("Acer", 1000, "Black", sellernames);
		String jsonString = jsonSer.serialize(product);
		System.out.println("Print json string:" + jsonString);

		// POJO to XML

		XmlSerializer xmlSer = XmlSerializer.DEFAULT_NS_SQ_READABLE;
		String xmlString = xmlSer.serialize(product);
		System.out.println("Print xml string:" + xmlString);
	}

	@Test
	public void Deserializer() throws IOException, ParseException {

		String jsonResponse = "{\n"
				+ "	\"color\": \"White\",\n"
				+ "	\"name\": \"MAcbookPro\",\n"
				+ "	\"price\": 1000,\n"
				+ "	\"sellerNames\": [\n"
				+ "		\"Neon Enterprise\",\n"
				+ "		\"ABC Software\",\n"
				+ "		\"XYZ IT solutions\"\n"
				+ "	]\n"
				+ "}";
		JsonParser jsonparser = JsonParser.DEFAULT;
		ProductPOJO prodDes = jsonparser.parse(jsonResponse, ProductPOJO.class);
		System.out.println(prodDes);

	}
}
