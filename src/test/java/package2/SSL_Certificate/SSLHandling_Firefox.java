package package2.SSL_Certificate;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SSLHandling_Firefox {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();

		FirefoxOptions firefoxOptions = new FirefoxOptions();
		firefoxOptions.setAcceptInsecureCerts(false);

		WebDriver driver = new FirefoxDriver(firefoxOptions);

		driver.get("https://self-signed.badssl.com/");
		System.out.println("The page title is : " + driver.getTitle());
		driver.quit();

	}

}
