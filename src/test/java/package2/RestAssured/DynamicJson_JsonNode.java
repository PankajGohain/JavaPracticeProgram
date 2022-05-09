package package2.RestAssured;

import com.fasterxml.jackson.databind.ObjectMapper;

//The simplest and straightforward way of mapping dynamic JSON properties is to use the JsonNode class provided by Jackson. 
//This class is capable of handling dynamic properties.
//https://attacomsian.com/blog/jackson-map-dynamic-json-object

public class DynamicJson_JsonNode {

	public static void main(String[] args) {

		try {
			// JSON string
			String json = "{\"name\":\"John Doe\",\"email\":\"john.doe@example.com\","
					+ "\"roles\":[\"Member\",\"Admin\"],\"admin\":true,\"address\":{\"city\""
					+ ":\"New York City\",\"state\":\"New York\",\"zipCode\":66123," + "\"country\":\"US\"}}";

			// create object mapper instance
			ObjectMapper mapper = new ObjectMapper();

			// convert JSON string to Java Object
			User user = mapper.readValue(json, User.class);

			// print user object
			System.out.println(user);

			// get properties from address
			System.out.println(user.getAddress().path("city").asText());
			System.out.println(user.getAddress().path("state").asText());

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

}
