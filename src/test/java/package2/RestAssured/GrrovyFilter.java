package package2.RestAssured;

import io.restassured.path.json.JsonPath;

public class GrrovyFilter {

	public static void main(String[] args) {

		String json = "[\r\n" + "	{\r\n" + "		\"id\": 1,\r\n" + "		\"first_name\": \"Lauraine\",\r\n"
				+ "		\"last_name\": \"Vearnals\",\r\n" + "		\"email\": \"lvearnals0@last.fm\",\r\n"
				+ "		\"gender\": \"F\"\r\n" + "	},\r\n" + "	{\r\n" + "		\"id\": 2,\r\n"
				+ "		\"first_name\": \"Chan\",\r\n" + "		\"last_name\": \"Skittreal\",\r\n"
				+ "		\"email\": \"cskittreal1@twitter.com\",\r\n" + "		\"gender\": \"M\"\r\n" + "	},\r\n"
				+ "	{\r\n" + "		\"id\": 3,\r\n" + "		\"first_name\": \"Randolph\",\r\n"
				+ "		\"last_name\": \"Patnelli\",\r\n" + "		\"email\": \"rpatnelli2@aboutads.info\",\r\n"
				+ "		\"gender\": \"M\"\r\n" + "	},\r\n" + "	{\r\n" + "		\"id\": 4,\r\n"
				+ "		\"first_name\": \"Bellanca\",\r\n" + "		\"last_name\": \"Downer\",\r\n"
				+ "		\"email\": \"bdowner3@wisc.edu\",\r\n" + "		\"gender\": \"F\"\r\n" + "	},\r\n" + "	{\r\n"
				+ "		\"id\": 5,\r\n" + "		\"first_name\": \"Kippy\",\r\n" + "		\"last_name\": \"Vial\",\r\n"
				+ "		\"email\": \"kvial4@posterous.com\",\r\n" + "		\"gender\": \"M\"\r\n" + "	},\r\n"
				+ "	{\r\n" + "		\"id\": 6,\r\n" + "		\"first_name\": \"Angela\",\r\n"
				+ "		\"last_name\": \"Dagon\",\r\n" + "		\"email\": \"adagon5@networksolutions.com\",\r\n"
				+ "		\"gender\": \"F\"\r\n" + "	},\r\n" + "	{\r\n" + "		\"id\": 7,\r\n"
				+ "		\"first_name\": \"Eolande\",\r\n" + "		\"last_name\": \"McKeaveney\",\r\n"
				+ "		\"email\": \"emckeaveney6@simplemachines.org\",\r\n" + "		\"gender\": \"F\"\r\n"
				+ "	},\r\n" + "	{\r\n" + "		\"id\": 8,\r\n" + "		\"first_name\": \"Lorelei\",\r\n"
				+ "		\"last_name\": \"Abbots\",\r\n" + "		\"email\": \"labbots7@paypal.com\",\r\n"
				+ "		\"gender\": \"F\"\r\n" + "	},\r\n" + "	{\r\n" + "		\"id\": 9,\r\n"
				+ "		\"first_name\": \"Darrelle\",\r\n" + "		\"last_name\": \"Rutley\",\r\n"
				+ "		\"email\": \"drutley8@columbia.edu\",\r\n" + "		\"gender\": \"F\"\r\n" + "	},\r\n"
				+ "	{\r\n" + "		\"id\": 10,\r\n" + "		\"first_name\": \"Alta\",\r\n"
				+ "		\"last_name\": \"O'Gormley\",\r\n" + "		\"email\": \"aogormley9@usatoday.com\",\r\n"
				+ "		\"gender\": \"F\"\r\n" + "	}\r\n" + "]";

		String json1 = "{\r\n" + "	\"data\": [\r\n" + "		{\r\n" + "			\"id\": 1,\r\n"
				+ "			\"first_name\": \"Lauraine\",\r\n" + "			\"last_name\": \"Vearnals\",\r\n"
				+ "			\"email\": \"lvearnals0@last.fm\",\r\n" + "			\"gender\": \"F\"\r\n" + "		},\r\n"
				+ "		{\r\n" + "			\"id\": 2,\r\n" + "			\"first_name\": \"Chan\",\r\n"
				+ "			\"last_name\": \"Skittreal\",\r\n" + "			\"email\": \"cskittreal1@twitter.com\",\r\n"
				+ "			\"gender\": \"M\"\r\n" + "		}\r\n" + "	]\r\n" + "}";

		JsonPath jp = new JsonPath(json);
		System.out.println(jp.getString("findAll{it.id>3 & it.id<8}.first_name"));
		System.out.println(jp.getList("findAll{it.gender == 'F'}.first_name"));

		JsonPath jp1 = new JsonPath(json1);
		System.out.println(jp1.getString("data.find{contains(it.first_name, 'Chan')}.first_name"));
	}

}
