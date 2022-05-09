package package2.RestAssured;

import org.json.JSONException;
import org.json.JSONObject;
import org.skyscreamer.jsonassert.JSONAssert;
import org.skyscreamer.jsonassert.JSONCompareMode;
import org.testng.annotations.Test;

//http://makeseleniumeasy.com/2021/03/08/rest-assured-tutorial-70-compare-json-objects-using-jsonassert-library/
//http://makeseleniumeasy.com/2021/05/07/rest-assured-tutorial-71-compare-json-arrays-using-jsonassert-library/

public class CompareJsonObjectByJsonAssert {

	@Test
	public void exactSameJson() throws JSONException {

		String jsoNobject1 = "{\r\n" + "  \"firstName\" : \"Amod\",\r\n" + "  \"lastName\": \"Mahajan\"\r\n" + "}";

		String jsonObject2 = "{\r\n" + "  \"firstName\" : \"Amod\",\r\n" + "  \"lastName\": \"Mahajan\"\r\n" + "}";

		// Lenient mode - extensible and no strict ordering
		JSONAssert.assertEquals(jsoNobject1, jsonObject2, JSONCompareMode.LENIENT);
	}

	@Test
	public void exactSameJsonWIthDifferentOrder() throws JSONException {

		String jsoNobject1 = "{\r\n" + "  \"firstName\" : \"Amod\",\r\n" + "  \"lastName\": \"Mahajan\"\r\n" + "}";

		String jsonObject2 = "{\r\n" + "  \"lastName\": \"Mahajan\",\r\n" + "  \"firstName\": \"Amod\"\r\n" + "}";

		// Lenient mode - extensible and no strict ordering but ordering will not be applicable for JSON objects
		JSONAssert.assertEquals(jsoNobject1, jsonObject2, JSONCompareMode.LENIENT);
	}

	@Test
	public void sameFieldsWithDifferentValues() throws JSONException {

		String jsoNobject1 = "{\r\n" + "  \"firstName\" : \"Amod\",\r\n" + "  \"lastName\": \"Mahajan\"\r\n" + "}";

		String jsonObject2 = "{\r\n" + "  \"lastName\": \"Mahajan\",\r\n" + "  \"firstName\": \"Rahul\"\r\n" + "}";

		JSONAssert.assertEquals(jsoNobject1, jsonObject2, JSONCompareMode.LENIENT);
	}

	@Test
	public void unmatchedDataType() throws JSONException {

		String jsoNobject1 = "{\r\n" + "  \"lastName\": \"Mahajan\",\r\n" + "  \"firstName\": \"Amod\",\r\n"
				+ "  \"age\": \"18\"\r\n" + "}";

		String jsonObject2 = "{\r\n" + "  \"lastName\": \"Mahajan\",\r\n" + "  \"firstName\": \"Amod\",\r\n"
				+ "  \"age\": 18\r\n" + "}";
		// First json has 18 as string while second json has 18 as int
		JSONAssert.assertEquals(jsoNobject1, jsonObject2, JSONCompareMode.LENIENT);
	}

	@Test
	public void strictMatchExample1() throws JSONException {

		String jsoNobject1 = "{\r\n" + "  \"firstName\" : \"Amod\",\r\n" + "  \"lastName\": \"Mahajan\"\r\n" + "}";

		String jsonObject2 = "{\r\n" + "  \"firstName\" : \"Amod\",\r\n" + "  \"lastName\": \"Mahajan\",\r\n"
				+ "  \"age\": 28\r\n" + "}";

		JSONAssert.assertEquals(jsoNobject1, jsonObject2, JSONCompareMode.STRICT);
	}

	@Test
	public void matchJsonObject() throws JSONException {
		
		JSONObject jsonObject1 = new JSONObject();
		jsonObject1.put("firstName", "Amod");
		jsonObject1.put("lastName", "Mahajan");
		
		JSONObject jsonObject2 = new JSONObject();
		jsonObject2.put("firstName", "Amod");
		jsonObject2.put("lastName", "Mahajan");
		
		JSONAssert.assertEquals(jsonObject1, jsonObject2, JSONCompareMode.LENIENT);
	}
	
	@Test
	public void matchJsonObjectBoolean() throws JSONException {
		
		JSONObject jsonObject1 = new JSONObject();
		jsonObject1.put("firstName", "Amod");
		jsonObject1.put("lastName", "Mahajan");
		
		
		JSONObject jsonObject2 = new JSONObject();
		jsonObject2.put("firstName", "Rahul");
		jsonObject2.put("lastName", "Mahajan");
		
		
		//JSONAssert.assertEquals(jsonObject1, jsonObject2, false);
		//By default, it will be non-strict and pass as true if we want strict mode.
		JSONAssert.assertEquals("Jsons are not equal", jsonObject1, jsonObject2, false);
	}
	
	@Test
	public void errorHandling() throws JSONException {
		
		JSONObject jsonObject1 = new JSONObject();
		jsonObject1.put("firstName", "Amod");
		jsonObject1.put("lastName", "Mahajan");
		
		
		JSONObject jsonObject2 = new JSONObject();
		jsonObject2.put("firstName", "Rahul");
		jsonObject2.put("lastName", "Mahajan");
		
		try {
		JSONAssert.assertEquals(jsonObject1, jsonObject2, false);
		}catch(Error e)
		{
			System.out.println("Error occured as JSONs are not same.");
		}
	}
}
