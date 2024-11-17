package package2.DesignPattern.Decorator_Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {

	WebDriver driver;

	@BeforeMethod
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	@Test
	public void testLogin() {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.login("test", "test");
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
