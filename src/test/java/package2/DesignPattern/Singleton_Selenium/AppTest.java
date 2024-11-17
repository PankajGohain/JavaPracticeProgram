package package2.DesignPattern.Singleton_Selenium;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.Parameters;

public class AppTest {
	private WebDriver driver;

	@BeforeClass
	@Parameters("browser")
	public void setUp(String browser) {
		driver = WebDriverManager.getInstance(browser).getDriver();

	}

	@Test
	public void testGoogle() {
		driver.get("https://www.google.com");
		System.out.println(Thread.currentThread().getName() + ":" + driver.getTitle());
		Assert.assertEquals(driver.getTitle(), "Google");
	}

	@AfterClass
	public void tearDown() {

		WebDriverManager.quitBrowser();
	}

}