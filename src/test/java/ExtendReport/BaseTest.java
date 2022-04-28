package ExtendReport;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest extends DriverFactory {

	private WebDriver driver;

	public WebDriver getDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		return driver;

	}

	public static String getScreenshot(String tcName, WebDriver driver) throws IOException {

		TakesScreenshot ts = (TakesScreenshot) driver;
		File sourceFile = ts.getScreenshotAs(OutputType.FILE);
		String destPath = System.getProperty("user.dir") + "\\src\\test\\java\\ExtendReport\\" + tcName + ".png";
		FileUtils.copyFile(sourceFile, new File(destPath));
		return destPath;

	}
}
