package package2.RestAssured;

import java.util.HashMap;
import java.util.Iterator;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

//https://medium.com/@supriyaran/how-to-parse-nested-json-in-java-269ca24e260c

public class DynamicJsonParsing {

	public static void main(String[] args) throws JSONException {
		String inputJson = "{\r\n" + "  \"destination_addresses\": [\r\n" + "    \"Philadelphia, PA, USA\"\r\n"
				+ "  ],\r\n" + "  \"origin_addresses\": [\r\n" + "    \"New York, NY, USA\"\r\n" + "  ],\r\n"
				+ "  \"rows\": [{\r\n" + "    \"elements\": [{\r\n" + "      \"distance\": {\r\n"
				+ "        \"text\": \"94.6 mi\",\r\n" + "        \"value\": 152193\r\n" + "      },\r\n"
				+ "      \"duration\": {\r\n" + "        \"text\": \"1 hour 44 mins\",\r\n"
				+ "        \"value\": 6227\r\n" + "      },\r\n" + "      \"status\": \"OK\"\r\n" + "    }]\r\n"
				+ "  }],\r\n" + "  \"status\": \"OK\"\r\n" + "}";
		JSONObject inputJSONOBject = new JSONObject(inputJson);
		getKey(inputJSONOBject, "text");
	}

	public static void parseObject(JSONObject json, String key) throws JSONException {
		System.out.println("Key : " + key + " has value : " + json.get(key));
		HashMap<Object, Object> hmap = new HashMap<Object, Object>();
		hmap.put(key, json.get(key));
		System.out.println(hmap);
	}

	public static void getKey(JSONObject json, String key) throws JSONException {
		boolean exists = json.has(key);
		Iterator<?> keys;
		String nextKeys;
		if (!exists) {
			keys = json.keys();
			while (keys.hasNext()) {
				nextKeys = (String) keys.next();
				try {
					if (json.get(nextKeys) instanceof JSONObject) {
						if (exists == false) {
							getKey(json.getJSONObject(nextKeys), key);
						}
					} else if (json.get(nextKeys) instanceof JSONArray) {
						JSONArray jsonarray = json.getJSONArray(nextKeys);
						for (int i = 0; i < jsonarray.length(); i++) {
							String jsonarrayString = jsonarray.get(i).toString();
							JSONObject innerJSOn = new JSONObject(jsonarrayString);
							if (exists == false) {
								getKey(innerJSOn, key);
							}
						}
					}
				} catch (Exception e) {
				}
			}
		} else {
			parseObject(json, key);
		}
	}

}
