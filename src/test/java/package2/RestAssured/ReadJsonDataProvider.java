package package2.RestAssured;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ReadJsonDataProvider {

	@Test(dataProvider = "jp")
	public void login(String data) {

		String unamePwd[] = data.split(",");
		String uname = unamePwd[0];
		String password = unamePwd[1];

		System.out.println(uname);
		System.out.println(password);

	}

	@DataProvider(name = "jp")
	public String[] readjson() throws IOException, ParseException {
		JSONParser jp = new JSONParser();
		FileReader reader = new FileReader("D:\\Eclipse-project\\JavaProgram\\src\\Package2\\testdata.json");

		Object obj = jp.parse(reader); // to parse the json file and it will return java object

		JSONObject loginsJsonObj = (JSONObject) obj; // From this java object we need to extract the json object just
														// typecast it

		JSONArray loginJsonArray = (JSONArray) loginsJsonObj.get("userlogins"); // extracted json array by specifying
																				// the json array value

		String arr[] = new String[loginJsonArray.size()];

		for (int i = 0; i < loginJsonArray.size(); i++) {

			JSONObject users = (JSONObject) loginJsonArray.get(i);
			String username = (String) users.get("username");
			String password = (String) users.get("password");

			arr[i] = username + "," + password;
		}

		return arr;
	}
}
