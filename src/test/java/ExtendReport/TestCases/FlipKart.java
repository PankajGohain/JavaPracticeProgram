package ExtendReport.TestCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import ExtendReport.BaseTest;

public class FlipKart extends BaseTest{
	
	public WebDriver driver;

	@Test
	public void launchFlipkart() throws InterruptedException {

		driver = getDriver();
		System.out.println(Thread.currentThread().getId());
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(3000);
		driver.quit();
	}
	

}
