package ExtendReport.TestCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import ExtendReport.BaseTest;

public class Amazon extends BaseTest {

	public WebDriver driver;

	@Test
	public void launchAmazon() throws InterruptedException {

		driver = getDriver();
		System.out.println(Thread.currentThread().getId());
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
		driver.quit();
	}

}
