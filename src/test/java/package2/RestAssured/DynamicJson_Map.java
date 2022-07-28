package package2.RestAssured;

import com.fasterxml.jackson.databind.ObjectMapper;

//Another way of storing the dynamic JSON property like address is to use the Java Map collection. 
//This will also remove the extra Jackson dependency.
//https://attacomsian.com/blog/jackson-map-dynamic-json-object
public class DynamicJson_Map {

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
			System.out.println(user.getAddress().get("city"));
			System.out.println(user.getAddress().get("country"));

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

}
