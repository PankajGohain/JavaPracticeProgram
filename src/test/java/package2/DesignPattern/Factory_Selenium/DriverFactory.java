package package2.DesignPattern.Factory_Selenium;

public class DriverFactory {

	public static BrowserDriver getDriver(String browserName) {
		switch (browserName.toLowerCase()) {
		case "chrome":
			return new ChromeDriverManager();
		case "firefox":
			return new FirefoxDriverManager();
		case "edge":
			return new EdgeDriverManager();
		default:
			throw new IllegalArgumentException("Invalid Browser Name");
		}
	}

}
