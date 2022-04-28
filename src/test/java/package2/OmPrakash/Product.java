package package2.OmPrakash;

import java.io.IOException;

public class Product {

	private int id;

	private String name;

	public Product() {
	}

	// So with this, we got the Json array extracted as the array of types product
	// and now we can look through this array and we can extract our desired
	// product.
	public Product(int id) throws IOException {

		Product[] prods = JacksonUtils.deserialzeJsonGeneric("product", Product[].class);

		for (Product product : prods) {

			if (product.getId() == id) {
				this.id = id;
				this.name = product.getName();
			}
		}

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
