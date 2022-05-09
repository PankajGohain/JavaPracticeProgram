package package2.RestAssured;

import java.io.File;
import java.util.List;

import io.restassured.path.json.JsonPath;

public class jsonFilterPart2 {

	public static void main(String[] args) {

		File jsonArrayFile = new File(System.getProperty("user.dir")+"\\src\\test\\java\\package2\\jsonFilter2.json");
		JsonPath jsonPath = JsonPath.from(jsonArrayFile);
		
		System.out.println("First name is first employee :"+ jsonPath.getString("[0].first_name"));
		
		System.out.println("All details of first employee : " +jsonPath.getJsonObject("[0]"));
		
		System.out.println("First name of all employees" + jsonPath.getList("first_name"));
		
		/* To get all first name of all females only 
		 * If we want to filter records based on conditions we can use find or findAll expression.
		 * findAll will iterate through each element in array and match condition. "it" represent current element.
		 * For each element it will check if gender is "female". If yes then take firstName of current element. 
		 * findAl returns a List. */
		System.out.println("First name of all female employees : "+jsonPath.getList("findAll{it.gender == 'Female'}.first_name"));
		System.out.println("First name of all female employees : "+jsonPath.getList("findAll{it -> it.gender == 'Female'}.first_name"));
		
		/* To get first female name 
		 * If we want to get firstName of first female employee we can use find expression.*/
		System.out.println("First name of first female employee : "+jsonPath.getString("find{it.gender == 'Female'}.first_name"));
		
		
		// We can also use relational operator like first name of all employees whose id is 5 or more
		 
		System.out.println("First name of all employees whose id is 5 or more : " + jsonPath.getList("findAll{it.id >= 5}.first_name"));
		
		// we can use use and (&) operator - logical
		System.out.println("First name of all employees whose id is 5 or more but less than 8 : " + jsonPath.getList("findAll{it.id >= 5 & it.id < 8}.first_name"));
		
		// We can also use or (|) operator
		System.out.println("First name of all employees whose id is greater than 9 or gender is female : " + jsonPath.getList("findAll{it.id >= 9 | it.gender == 'Female'}.first_name"));
		
		// We can get size of array using size() or size
		System.out.println("Total number of employees : " + jsonPath.getString("size()"));
		
		//===================================================================================================
		File file = new File(System.getProperty("user.dir") + "\\src\\test\\java\\package2\\books.json");
		JsonPath jp = new JsonPath(file);
		List<String> cate=jp.getList("store.book.findAll{it.category=='reference'}");
		System.out.println(cate);
		
	}

}
