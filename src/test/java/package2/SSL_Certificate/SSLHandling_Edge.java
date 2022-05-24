package package2.SSL_Certificate;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SSLHandling_Edge {

	public static void main(String[] args) {

		WebDriverManager.edgedriver().setup();

		// Creating an object of EdgeOptions class
		EdgeOptions edgeOptions = new EdgeOptions();

		// Accepting the Insecure certificates through boolean parameter
		edgeOptions.setAcceptInsecureCerts(true);

		// Creating instance of Edge driver by passing reference of EdgeOptions object
		// Assuming EdgeDriver path has been set in system properties
		WebDriver driver = new EdgeDriver(edgeOptions);

		driver.get("https://self-signed.badssl.com/");
		System.out.println("The page title is : " + driver.getTitle());
		driver.quit();

	}

}
