package package2.RestAssured;

import static io.restassured.RestAssured.*;
import static io.restassured.path.json.JsonPath.from;

import java.util.List;

import io.restassured.http.Cookie;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class WithoutJsonPath {

	public static void main(String[] args) {

		String response = when().get("https://jsonplaceholder.typicode.com/photos").then().extract().asString();
		List<String> albumID = from(response).get("id");
		System.out.println(albumID.size());

		Response resp = when().get("https://jsonplaceholder.typicode.com/photos");
		Headers headers = resp.getHeaders();
		for (Header head : headers) {
			System.out.println(head.getName() + "=====>" + head.getValue());

		}
		
		//============CONNECT=================
		
		when().request("CONNECT","https://jsonplaceholder.typicode.com/photos").then().statusCode(200);
		
		
		

		// setRoot
		String response1 = when().get("https://jsonplaceholder.typicode.com/photos").then().extract().asString();

		@SuppressWarnings("deprecation")
		JsonPath js = new JsonPath(response1).setRoot("RestResponse.result");
		String resResp = js.get("name");

	}

}
