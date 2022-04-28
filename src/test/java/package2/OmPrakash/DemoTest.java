package package2.OmPrakash;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.Test;

public class DemoTest {

	@Test
	public void displayAddress() throws IOException {

		BillingAddress add = new BillingAddress();

		File fileName = new File(System.getProperty("user.dir") + "\\src\\test\\java\\package2\\billingAdd.json");
		add = JacksonUtils.deserialzeJsonBill(fileName, add);

		System.out.println(add.getAddressLocation());

	}

	@Test
	public void displayAddressGeneric() throws IOException {

		BillingAddress billAdd = JacksonUtils.deserialzeJsonGeneric("billingAdd", BillingAddress.class);
		System.out.println(billAdd.getFirstName());
		System.out.println(billAdd.getLastName());
	}

	@Test
	public void displayProductNameID() throws IOException {
		Product p = new Product(9999);
		System.out.println(p.getName());
		System.out.println(p.getId());
	}

}

//[if file is located in resource folder]
//InputStream is = getClass().getClassLoader().getResourceAsStream("billingAdd.json"); [