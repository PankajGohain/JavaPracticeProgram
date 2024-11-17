package package2.DesignPattern.Strategy_Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocalExecutionStrategy implements TestExecutionStrategy {

	@Override
	public WebDriver setupDriver(String browserName) {

		switch (browserName.toLowerCase().trim()) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			return new ChromeDriver();
		case "firefox":
			return new FirefoxDriver();
		case "edge":
			return new EdgeDriver();
		default:
			System.out.println("Please pass correct browser");
			throw new IllegalStateException("WRONG BROWSER");
		}
	}

}
