package package2.RestAssured;

import java.io.File;
import java.util.List;

import io.restassured.path.json.JsonPath;

public class JsonPathWithFilter {

	public static void main(String[] args) {

		File file = new File(System.getProperty("user.dir") + "\\src\\test\\java\\package2\\books.json");
		JsonPath jp = new JsonPath(file);

		List<String> bookAuthor = jp.getList("store.book.author");
		System.out.println(bookAuthor);

		List<String> cate = jp.getList("store.book.findAll{it.category=='reference'}");
		System.out.println(cate);

		List<String> femaleAuthor = jp.getList("store.book.findAll{it.gender=='Female'}.author");
		System.out.println(femaleAuthor);

		String bookTitle = jp.getString("store.book.find{it.author=='Nigel Rees' && it.gender=='Male'}.title");
		System.out.println(bookTitle);

	}

}
