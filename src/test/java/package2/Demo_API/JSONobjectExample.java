package package2.Demo_API;

import org.json.JSONException;

//https://qaautomation.expert/2021/06/03/how-to-test-post-request-from-json-object-in-rest-assured/

import org.json.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.equalTo;

public class JSONobjectExample {

	public static void main(String[] args) throws JSONException {

		JSONObject root = new JSONObject();
		root.put("profile_image", "test.png");
		JSONObject detail = new JSONObject();
		detail.put("update_message", "details of a new resource");
		detail.put("employee_age", "34");
		root.put("employee_details", detail);
		root.put("employee_name", "Pankaj");
		root.put("employee_salary", "123456");
		
		Response res=RestAssured.given()
						.baseUri("http://dummy.restapiexample.com/api")
						.contentType(ContentType.JSON)
						.body(root.toString())
						.log().all()
					.when()
						.post("/v1/create")
					.then()
						.assertThat().statusCode(200)
						.body("data.employee_name", equalTo("Pankaj1"))
                        .body("data.employee_details.employee_age", equalTo("341"))
						.extract().response();
		System.out.println("=====================================");
		System.out.println(res.asPrettyString());
		System.out.println("*************************************");
		System.out.println(res.getBody().asPrettyString());

	}

}
