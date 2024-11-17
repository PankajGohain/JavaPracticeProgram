package package2.DesignPattern.Factory_Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeDriverManager implements BrowserDriver {

	@Override
	public WebDriver createDriver() {
		WebDriverManager.chromedriver().setup();
		return new ChromeDriver();
	}

}
