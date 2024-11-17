package package2.DesignPattern.Builder_Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RegPageTest {

	WebDriver driver;

	@BeforeTest
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("www.google.com");
	}

	@Test
	public void userRegTest() {

		Register register = new Register.RegisterBuilder()
									.setFirstName("Pankaj")
									.setLastName("Kumar")
									.setEmail("pankaj.kumar@gmail.com")
									.setTelephone("97656788")
									.setPassword("test")
									.setConfirmPassword("test1")
									.build();

		RegisterPage regPage = new RegisterPage(driver);
		regPage.userRegister(register);

	}

}
