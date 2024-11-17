package package2.DesignPattern.Factory;

public class OSFactory {

	public OS getInstance(String type) {

		if (type.equalsIgnoreCase("Open")) {
			return new Android();
		} else if (type.equalsIgnoreCase("Closed")) {
			return new Windows();
		} else {
			return new IOS();
		}

	}

}
