package package2.RestAssured;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class PathParamDataProvider {
	
	
	@Test(dataProvider = "circuitLocations")
	public void circuitLocationTest(String circuitId, String location) {
			
		Response res=given().
			pathParam("circuitId",circuitId).
		when().
			get("http://ergast.com/api/f1/circuits/{circuitId}.json").
		then().
			assertThat().
			body("MRData.CircuitTable.Circuits[0].Location.country",equalTo(location)).extract().response();
		
		System.out.println(res.asPrettyString());
	}
	
	
	
	
	@DataProvider(name = "circuitLocations")
	public String[][] createCircuitTestData() {
			
		return new String[][] {
				{"adelaide","Australia"},
				{"detroit","USA"},
				{"george","South Africa"}
		};
	}

}
