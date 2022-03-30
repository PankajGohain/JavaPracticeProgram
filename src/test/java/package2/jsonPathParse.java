package package2;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import io.restassured.path.json.JsonPath;

public class jsonPathParse {

	public static void main(String[] args) throws IOException {
		String content = new String(
				Files.readAllBytes(Paths.get(System.getProperty("user.dir") + "\\src\\Package2\\parseJson.json")));

		JsonPath jp = new JsonPath(content);

		System.out.println(jp.getString("firstName"));

		System.out.println(jp.getList("address"));
		System.out.println(jp.getInt("address.size()"));
	}

}
