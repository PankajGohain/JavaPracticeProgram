package package2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class svgGraphComplex {

	public static void main(String[] args) throws InterruptedException, ParseException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get(
				"https://www.google.com/search?q=corona+cases+in+india&sxsrf=AOaemvI1DuBwYlMvnl_3H0FLLfAvZbhn4w%3A1640701186501&ei=Ah3LYY-EHqqMr7wP2Pa9kAg&oq=corona+cases+in+&gs_lcp=Cgdnd3Mtd2l6EAMYADIQCAAQgAQQhwIQsQMQgwEQFDIQCAAQgAQQhwIQsQMQgwEQFDILCAAQgAQQsQMQgwEyCwgAEIAEELEDEIMBMgUIABCABDILCAAQgAQQsQMQgwEyCggAELEDEIMBEAoyCwgAEIAEELEDEIMBMgUIABCABDIFCAAQgAQ6CggAEEcQsAMQyQM6CAgAEJIDELADOgcIABBHELADOgcIABCwAxBDOg4IABCxAxCDARDJAxCRAjoFCAAQkgM6BQgAEJECOgsIABCxAxCDARCRAjoICAAQsQMQgwE6DggAEIAEELEDEIMBEMkDSgQIQRgASgQIRhgAUKEHWLkWYI4eaAJwAngAgAGyAogB2Q6SAQcwLjUuMy4xmAEAoAEByAEKwAEB&sclient=gws-wiz");

		Thread.sleep(10000);

		WebElement ele = driver.findElement(By.xpath("(//*[local-name()='svg' and @class='uch-psvg'])[2]"));

		int getTopLeftY = ((ele.getSize().getHeight()) / 2) - ele.getSize().getHeight();
		int getTopLeftX = ((ele.getSize().getWidth()) / 2) - ele.getSize().getWidth();

		Actions act = new Actions(driver);

		String start_date = "20-03-2020";
		SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yyyy");
		Date d1 = sdf.parse(start_date);
		Date d2 = new Date();
		long diffInDate = TimeUnit.MILLISECONDS.toDays(d2.getTime() - d1.getTime());

		for (int i = 0; i < diffInDate; i++) {
			act.moveToElement(ele, getTopLeftX + i, getTopLeftY).build().perform();
			String data = driver.findElement(By.xpath("//table[@class='swWWne']/tbody")).getText();
			System.out.println(data);
		}

	}

}
