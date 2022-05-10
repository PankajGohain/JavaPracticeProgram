package WireMock;

import static com.github.tomakehurst.wiremock.client.WireMock.matching;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.github.tomakehurst.wiremock.WireMockServer;
import com.github.tomakehurst.wiremock.client.ResponseDefinitionBuilder;
import com.github.tomakehurst.wiremock.client.WireMock;
import org.apache.http.HttpStatus;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class WireMockConditional {

	private static final String HOST = "localhost";
	private static final int PORT = 9999;
	private static final String END_POINT = "/movie/v1";
	private static WireMockServer server = new WireMockServer(PORT);

	@BeforeClass
	public void initializeServer() {

		System.out.println("Initializing Server");

		server.start();
		WireMock.configureFor(HOST, PORT);

		// Mock response1
		ResponseDefinitionBuilder mockResponse1 = new ResponseDefinitionBuilder();
		mockResponse1.withStatus(503);
		mockResponse1.withHeader("Content-Type", "text/html");
		mockResponse1.withBody("Service Not Available");

		// Mock response1
		ResponseDefinitionBuilder mockResponse2 = new ResponseDefinitionBuilder();
		mockResponse2.withStatus(200);
		mockResponse2.withHeader("Content-Type", "application/json");
		mockResponse2.withBody("{\"Current-Status\": \"running\"}");
		mockResponse2.withFixedDelay(2500);

		WireMock.stubFor(
				WireMock.get(END_POINT).withHeader("Accept", matching("text/plain")).willReturn(mockResponse1));
		WireMock.stubFor(
				WireMock.get(END_POINT).withHeader("Accept", matching("application/json")).willReturn(mockResponse2));

	}

	@Test
	public void conditionOne() {

		String mockAPI = "http://localhost:" + PORT + END_POINT;
		System.out.println("Service to hit: "+mockAPI);
		Response res = RestAssured.given().header("Accept", "text/plain").when().get(mockAPI);
		System.out.println(res.asString());
		Assert.assertEquals(res.getStatusCode(), HttpStatus.SC_SERVICE_UNAVAILABLE);
	}

	
	@Test
	public void conditonTwo(){
		String mockAPI = "http://localhost:" + PORT + END_POINT;
		System.out.println("Service to hit: "+mockAPI);
		Response res = RestAssured.given().header("Accept", "application/json").when().get(mockAPI);
		System.out.println(res.asString());
		Assert.assertEquals(res.getStatusCode(), HttpStatus.SC_OK);
		System.out.println(res.jsonPath().getString("Current-Status"));
	}	
	
	@Test
	public void conditonThree(){
		String mockAPI = "http://localhost:" + PORT + END_POINT+"/wrongAPI";
		System.out.println("Service to hit: "+mockAPI);
		Response res = RestAssured.given().header("Accept", "application/json").when().get(mockAPI);
		System.out.println(res.asString());
		Assert.assertEquals(res.getStatusCode(), HttpStatus.SC_NOT_FOUND);
	
	}
	
	@AfterClass
	public void closeServer() {
		if (server.isRunning() && server != null) {
			System.out.println("Shutting down");
			server.shutdown();
		}
	}

}
