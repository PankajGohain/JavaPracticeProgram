package ExtendReport.TestCases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import ExtendReport.BaseTest;

public class Myntra extends BaseTest{

	public WebDriver driver;

	@Test
	public void launchMyntra() throws InterruptedException {

		driver = getDriver();
		System.out.println(Thread.currentThread().getId());
		driver.get("https://www.myntra.com/");
		
		Thread.sleep(3000);
		Assert.assertEquals(driver.getTitle(), "Flipkart");
		driver.quit();
	}

}
