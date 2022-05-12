package package2.RestAssured;

import java.util.List;
import java.util.Map;

import io.restassured.RestAssured;
import io.restassured.response.Response;

//https://devqa.io/parse-json-response-rest-assured/

public class JsonPathComplex {

	public static void main(String[] args) {

		Response res = RestAssured.given().get("https://jsonplaceholder.typicode.com/users");

		// System.out.println(res.asPrettyString());

		String Unames = res.jsonPath().getString("username"); // Print all entries
		System.out.println(Unames);

		String Uname = res.jsonPath().getString("username[0]"); // Print first entrie
		System.out.println(Uname);

		List<String> lname = res.jsonPath().getList("name"); // Print value in list
		System.out.println(lname);
		System.out.println(lname.get(2));

		Map<Object, Object> company = res.jsonPath().getMap("company[1]"); // Fetching values in Map
		System.out.println(company.get("name"));

		List<Map<Object, Object>> lmap = res.jsonPath().getList("company"); // Fetch list of Company of type Map
		System.out.println(lmap);
		for (int i = 0; i < lmap.size(); i++) {
			System.out.println("Names of the Company is:" + lmap.get(i).get("name"));
		}

		List<Map<Object, Object>> addListMap = res.jsonPath().getList("address");	// Fetch list of Company of type Map
		System.out.println(addListMap);
		System.out.println(addListMap.get(1).get("geo"));
	}

}
