package package2.SSL_Certificate;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

//https://www.toolsqa.com/selenium-webdriver/ssl-certificate-in-selenium/

public class SSLHandling_Chrome {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		// Create instance of ChromeOptions Class
		ChromeOptions options = new ChromeOptions();

		// Using the accept insecure cert method with true as parameter to accept the untrusted certificate
		options.setAcceptInsecureCerts(true	);

		// Creating instance of Chrome driver by passing reference of ChromeOptions object
		WebDriver driver = new ChromeDriver(options);

		// Launching the URL
		driver.get("https://expired.badssl.com/");
		System.out.println("The page title is : " + driver.getTitle());
		driver.quit();

	}

}
