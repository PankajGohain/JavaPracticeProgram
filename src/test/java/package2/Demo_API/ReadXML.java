package package2.Demo_API;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.internal.path.xml.NodeChildrenImpl;

public class ReadXML {

	//https://chercher.tech/rest-assured/extract-xml-values-rest-assured
	
	@Test
	void sampleTest() {
		String book = RestAssured.given().when().get("https://chercher.tech/sample/api/books.xml").then().extract()
				.path("bookstore.book[0].title");
		System.out.println(book);
	}

	@Test
	void sampleTest1() {
		String book = RestAssured.given().when().get("https://chercher.tech/sample/api/books.xml").then().extract()
				.path("bookstore.book.findAll { it.@category == 'cooking' }.year");
		System.out.println(book);
	}
	
	@Test
	void sampleTest2() {
		String book = RestAssured.given().when()
		.get("https://chercher.tech/sample/api/books.xml")
		.then().extract().path("**.findAll { it.@category == 'cooking' }.year");
		System.out.println(book);
	}
	
	@Test   //When there is more than one matching element
	void sampleTest3() {
		NodeChildrenImpl book = RestAssured.given().when()
		.get("https://chercher.tech/sample/api/books.xml")
		.then().extract().path("bookstore.book.findAll { it.@category == 'cooking' }.price");
		System.out.println(book);
	}
	
	@Test   //To extract multiple values we have to use another class called NodeChildrenImpl
	void sampleTest4() {
		NodeChildrenImpl books = RestAssured.given().when()
		.get("https://chercher.tech/sample/api/books.xml")
		.then().extract().path("bookstore.book.title");
		System.out.println(books);
	}

	@Test
	void sampleTest5() {
		NodeChildrenImpl books = RestAssured.given().when()
		.get("https://chercher.tech/sample/api/books.xml")
		.then().extract().path("bookstore.book.title");

		System.out.println("just single string: "+ books);
		System.out.println("spcific index : "+ books.get(0));
		System.out.println("is empty : "+ books.isEmpty());
		System.out.println("size : "+ books.size());
		System.out.println("list : "+ books.list());
	}
	
	@Test
	void sampleTest6() {
		NodeChildrenImpl books = RestAssured.given().when()
		.get("https://chercher.tech/sample/api/books.xml")
		.then().extract().path("bookstore.book");

		System.out.println("name : "+ books.get(0).name());
		System.out.println("attributes : "+ books.get(0).attributes());
		System.out.println("getAttribute : "+ books.get(0).getAttribute("category"));
		System.out.println("get : "+ books.get(0).get("year"));
		System.out.println("children : "+ books.get(0).children());
		System.out.println("children : "+ books.get(0).children().get("price"));
		System.out.println("getNode : "+ books.get(0).getNode("price").children().get(0));
	}
}
