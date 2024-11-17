package package2.DesignPattern.Builder;

public class Shop {

	public static void main(String[] args) {

		Phone p = new PhoneBuilder().setOs("Android").setProcessor("AMD").getPhone();
		
		System.out.println(p);

	}

}
