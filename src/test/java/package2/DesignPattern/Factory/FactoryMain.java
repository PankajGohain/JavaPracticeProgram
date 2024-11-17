package package2.DesignPattern.Factory;

public class FactoryMain {

	public static void main(String[] args) {

		OSFactory factory = new OSFactory();
		OS osObj = factory.getInstance("Closed");
		osObj.spec();

		OS osObj1 = factory.getInstance("Open");
		osObj1.spec();
	}

}
