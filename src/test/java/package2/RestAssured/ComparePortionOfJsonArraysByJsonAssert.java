package package2.RestAssured;
import org.json.JSONArray;
import org.json.JSONException;
import org.skyscreamer.jsonassert.JSONAssert;
import org.skyscreamer.jsonassert.JSONCompareMode;

public class ComparePortionOfJsonArraysByJsonAssert {

	public static void main(String[] args) throws JSONException {

	
		JSONArray jSONArray1 = new JSONArray("[\r\n" + 
				"  {\r\n" + 
				"    \"id\": 1,\r\n" + 
				"    \"first_name\": \"Giavani\",\r\n" + 
				"    \"last_name\": \"Skellorne\"\r\n" + 
				"  },\r\n" + 
				"  {\r\n" + 
				"    \"id\": 2,\r\n" + 
				"    \"first_name\": \"Patton\",\r\n" + 
				"    \"last_name\": \"Buchett\"\r\n" + 
				"  }\r\n" + 
				"]");
		
			JSONArray jSONArray2 = new JSONArray("[\r\n" + 
				"  {\r\n" + 
				"    \"id\": 1,\r\n" + 
				"    \"first_name\": \"Giavani\",\r\n" + 
				"    \"last_name\": \"Skellorne\"\r\n" + 
				"  },\r\n" + 
				"  {\r\n" + 
				"    \"id\": 2,\r\n" + 
				"    \"first_name\": \"Harland\",\r\n" + 
				"    \"last_name\": \"Brookwood\"\r\n" + 
				"  },\r\n" + 
				"  {\r\n" + 
				"    \"id\": 3,\r\n" + 
				"    \"first_name\": \"Leigh\",\r\n" + 
				"    \"last_name\": \"Gatteridge\"\r\n" + 
				"  }\r\n" + 
				"]");
		
		// I want to assert address objects are same in both
		// Since index elements in both arrays are JSON objects so using proper method i.e. getJSONObject
		JSONAssert.assertEquals(jSONArray1.getJSONObject(0), jSONArray2.getJSONObject(0), JSONCompareMode.LENIENT);
	   }
		
	}
