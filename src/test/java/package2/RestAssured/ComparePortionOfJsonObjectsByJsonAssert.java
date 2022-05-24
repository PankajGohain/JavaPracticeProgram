package package2.RestAssured;
import org.json.JSONException;
import org.json.JSONObject;
import org.skyscreamer.jsonassert.JSONAssert;
import org.skyscreamer.jsonassert.JSONCompareMode;

//http://makeseleniumeasy.com/2021/05/14/rest-assured-tutorial-72-how-to-compare-part-of-json-objects-and-arrays-using-jsonassert-library/

public class ComparePortionOfJsonObjectsByJsonAssert {
	
	public static void main(String[] args) throws JSONException {
	
	JSONObject jsonObject1 = new JSONObject("{\r\n" + 
			"  \"lastName\": \"Animesh\",\r\n" + 
			"  \"firstName\": \"Prashant\",\r\n" + 
			"  \"address\": {\r\n" + 
			"    \"city\": \"Kolkata\",\r\n" + 
			"    \"state\": \"WB\"\r\n" + 
			"  }\r\n" + 
			"}");
	JSONObject jsonObject2 = new JSONObject("{\r\n" + 
			"  \"lastName\": \"Animesh\",\r\n" + 
			"  \"firstName\": \"Prashant\",\r\n" + 
			"  \"communicationAddress\": {\r\n" + 
			"    \"city\": \"Kolkata\",\r\n" + 
			"    \"state\": \"WB\"\r\n" + 
			"  },\r\n" + 
			"  \"skills\": [\r\n" + 
			"    \"CA\",\r\n" + 
			"    \"BCOM\"\r\n" + 
			"  ]\r\n" + 
			"}");
	
	// I want to assert address objects are same in both
	// Since "address" and "communicationAddress" are JSON Objects so we need to use proper method i.e. getJSONObject()
		JSONAssert.assertEquals(jsonObject1.getJSONObject("address"), jsonObject2.getJSONObject("communicationAddress"), JSONCompareMode.LENIENT);
   }

}
