package package2.RestAssured;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

//https://www.youtube.com/watch?v=U-5VHRvOFpA

public class JsonFileParse {

	public static void main(String[] args) throws IOException, ParseException {

		JSONParser jp = new JSONParser();

		FileReader file = new FileReader(System.getProperty("user.dir") + "\\src\\Package2\\parseJson.json");
		Object obj = jp.parse(file);

		JSONObject job = (JSONObject) obj;
		String fname = (String) job.get("firstName");
		String lname = (String) job.get("lastName");
		System.out.println(fname + " " + lname);

		JSONArray jarr = (JSONArray) job.get("address");
		System.out.println(jarr);

		int arrSize = jarr.size();

		for (int i = 0; i < arrSize; i++) {

			JSONObject add = (JSONObject) jarr.get(i);

			System.out.println("Address of " + i + " is:");
			System.out.println(add.get("street"));
			System.out.println(add.get("city"));
			System.out.println(add.get("state"));

		}

	}

}
