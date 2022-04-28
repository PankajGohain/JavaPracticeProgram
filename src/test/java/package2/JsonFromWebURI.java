package package2;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URL;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;

//https://www.youtube.com/watch?v=I6UsqFFoDG8&list=PLEiBaBxmVLi_4HbysORHdMon4b4YMcZIW&index=2

public class JsonFromWebURI {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {

		String demoURL = "https://raw.githubusercontent.com/ljharb/node-json-file/master/package.json";

		URL url = new URL(demoURL);

		ObjectMapper mapper = new ObjectMapper();
//		JsonPath jp = mapper.readValue(url, JsonPath.class);

		JsonNode jn = mapper.readValue(url, JsonNode.class);

		System.out.println(jn.get("version").asText());

		System.out.println(jn.path("author").path("name").asText());

		// ==============================================================================================

		// File -> URI -> URL -> JsonNode

		File file = new File(System.getProperty("user.dir") + "\\src\\test\\java\\package2\\books.json");

		URI uri = file.toURI(); // File to URI
		System.out.println(uri.toString());

		URL url1 = uri.toURL(); // URI to URL
		System.out.println(url1.toString());
		JsonNode jnode = mapper.readValue(url1, JsonNode.class);

		ArrayNode aNode = (ArrayNode) jnode.path("store").path("book");

		System.out.println(aNode);

		for (JsonNode a : aNode) {

			System.out.println("Categories are:" + a.get("category").asText());
		}
	}

}
