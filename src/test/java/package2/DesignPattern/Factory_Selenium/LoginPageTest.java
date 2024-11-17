package package2.DesignPattern.Factory_Selenium;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginPageTest {

	WebDriver driver;

	@BeforeTest
	public void setup() {
		driver = DriverFactory.getDriver("Chrome").createDriver();
	}

	@Test
	public void login() {
		driver.get("https://www.digitalocean.com/community/tutorials/builder-design-pattern-in-java");
		System.out.println(driver.getTitle());
	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
