package package2.DesignPattern;

public class Samosa {

	private volatile static Samosa samosa;

	private Samosa() {
		if (samosa != null) {
			throw new RuntimeException("You are trying to break singleton pattern");
		}

	}

	public static Samosa getSamosa() {

		if (samosa == null) {
			synchronized (Samosa.class) {
				if (samosa == null) {
					samosa = new Samosa();
				}
			}
		}
		return samosa;
	}

}
