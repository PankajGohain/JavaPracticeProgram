package WireMock;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.github.tomakehurst.wiremock.WireMockServer;
import com.github.tomakehurst.wiremock.client.ResponseDefinitionBuilder;
import com.github.tomakehurst.wiremock.client.WireMock;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class WireMockServerComplexJson {
	
	private static final String HOST = "localhost";
	private static final int PORT = 9999;
	private static final String END_POINT="/readfilefrom/index";
	private static WireMockServer server = new WireMockServer(PORT);
	
	@BeforeClass
	public void initializeServer() {

		System.out.println("Initializing Server");

		server.start();
		WireMock.configureFor(HOST, PORT);
		
		ResponseDefinitionBuilder mockResponse = new ResponseDefinitionBuilder();
		mockResponse.withStatus(201);
		mockResponse.withBodyFile("/home/qainfotech/Desktop/Test_Zapp/JavaProgram_latest/JavaPracticeProgram/src/test/java/package2/parseJson.json");
		WireMock.stubFor(WireMock.get(END_POINT).willReturn(mockResponse));
	}
	
	@Test
	public void testOne() {
		
		Response res=RestAssured.given()
				.get("http://localhost:"+PORT+END_POINT)
				.then()
				.assertThat()
				.extract().response();
		
		System.out.println(res.asString());
	}
	
	
	@AfterClass
	public void closeServer() {
		if (server.isRunning() && server != null) {
			System.out.println("Shutting down");
			server.shutdown();
		}
	}

}
