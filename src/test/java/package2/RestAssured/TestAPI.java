package package2.RestAssured;

import static io.restassured.RestAssured.given;

import java.io.File;
import java.io.FileWriter;
import java.util.concurrent.TimeUnit;

import io.restassured.RestAssured;
import io.restassured.http.Cookie;
import io.restassured.http.Cookies;
import io.restassured.http.Headers;
import io.restassured.response.Response;

public class TestAPI {

	public static void main(String[] args) {

		
		RestAssured.useRelaxedHTTPSValidation();
		
		Response res=given().log().if.relaxedHTTPSValidation().get("https://www.google.com").then().log().ifError().extract().response().as("Sample.class");
		res.jsonPath()
		
		Cookie c=res.getDetailedCookie("abcd");
		c.hasExpiryDate();
		res.getTimeIn(TimeUnit.MILLISECONDS);
		
		Headers headers=res.getHeaders();
		res.getBody().asString();
		
		FileWriter writer=new FileWriter(new File("kndjnjg"));
		writer.write("str");
		writer.close();;
		
	}

}
