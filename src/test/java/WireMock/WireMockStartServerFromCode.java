package WireMock;

import org.junit.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.github.tomakehurst.wiremock.WireMockServer;
import com.github.tomakehurst.wiremock.client.ResponseDefinitionBuilder;
import com.github.tomakehurst.wiremock.client.WireMock;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class WireMockStartServerFromCode {

	private static final String HOST = "localhost";
	private static final int PORT = 9999;
	private static WireMockServer server = new WireMockServer(PORT);

	@BeforeClass
	public void initializeServer() {

		System.out.println("Initializing Server");

		server.start();
		WireMock.configureFor(HOST, PORT);

		// Mock response first
		ResponseDefinitionBuilder mockResponse = new ResponseDefinitionBuilder();
		mockResponse.withStatus(201);
		mockResponse.withStatusMessage("Hello wiremock");
		mockResponse.withHeader("Content-Type", "text/plain");
		mockResponse.withHeader("token", "AuthToken_1111");
		mockResponse.withHeader("Set-Cookie", "session_id=9876543");
		mockResponse.withHeader("Set-Cookie", "split_test_group=B");
		mockResponse.withBody("expected response from the request");

		// Mock request- both will work

		WireMock.stubFor(WireMock.get("/emps/1").willReturn(mockResponse));
		// WireMock.givenThat(WireMock.get("/emps/1").willReturn(mockResponse));
	}

	@Test
	public void testCode() {

		Response res = RestAssured.given()
					.get("http://localhost:9999/emps/1")
				.then()
					.assertThat()
					.statusCode(201)
				.extract()
					.response();
		System.out.println(res.getHeader("token"));
		Assert.assertEquals(res.getCookie("session_id"), "9876543");
		System.out.println(res.getCookie("split_test_group"));
		System.out.println(res.getStatusLine());
		System.out.println(res.getBody().asString());

	}

	@AfterClass
	public void closeServer() {
		if (server.isRunning() && server != null) {
			System.out.println("Shutting down");
			server.shutdown();
		}
	}

}
