package package2.Demo_API;

import java.util.Arrays;

import org.apache.juneau.annotation.Beanc;

public class ProductPOJO {

	private String name;
	private int price;
	private String color;
	private String[] sellerName;

	@Beanc(properties = "name, price, color, sellernames")
	public ProductPOJO(String name, int price, String color, String[] sellernames) {
		this.name = name;
		this.price = price;
		this.color = color;
		this.sellerName = sellernames;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String[] getSellerName() {
		return sellerName;
	}

	public void setSellerName(String[] sellerName) {
		this.sellerName = sellerName;
	}

	@Override
	public String toString() {
		return "ProductPOJO [name=" + name + ", price=" + price + ", color=" + color + ", sellerName="
				+ Arrays.toString(sellerName) + "]";
	}

	
}
