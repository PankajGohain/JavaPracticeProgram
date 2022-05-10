package WireMock;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class WireMock_example {

	@Test
	public void testOne() {
		RestAssured.given().get("http://localhost:9999/user/1").then().assertThat().statusCode(201);

	}
	
	@Test
	public void testTwo() {
		String content=RestAssured
		.given()
			.get("http://localhost:9999/user/2")
		.then()
			.assertThat()
			.statusCode(200)
		.extract()
			.header("Content-Type");
		
		System.out.println("Response header is: "+content);
		Assert.assertEquals("text/plain", content);
	}
	
	@Test
	public void testThree() {
		
		Response res=RestAssured
				.given()
					.get("http://localhost:9999/user/2")
				.then()
					.assertThat()
					.statusCode(200)
				.extract()
					.response();
				
				System.out.println("Response header Content-Type is: "+res.getHeader("Content-Type"));
				System.out.println("Response header token is: "+res.getHeader("token"));
		
	}
}
