package package2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import Package1.newclass;
import io.github.bonigarcia.wdm.WebDriverManager;

//https://www.youtube.com/watch?v=as9J-nqTQx8&list=PLFGoYjJG_fqqKv9orO2FucxwcSl-QVCQe&index=3

public class svgGraph {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get(
				"https://www.google.com/search?q=corona+cases+in+india&sxsrf=AOaemvI1DuBwYlMvnl_3H0FLLfAvZbhn4w%3A1640701186501&ei=Ah3LYY-EHqqMr7wP2Pa9kAg&oq=corona+cases+in+&gs_lcp=Cgdnd3Mtd2l6EAMYADIQCAAQgAQQhwIQsQMQgwEQFDIQCAAQgAQQhwIQsQMQgwEQFDILCAAQgAQQsQMQgwEyCwgAEIAEELEDEIMBMgUIABCABDILCAAQgAQQsQMQgwEyCggAELEDEIMBEAoyCwgAEIAEELEDEIMBMgUIABCABDIFCAAQgAQ6CggAEEcQsAMQyQM6CAgAEJIDELADOgcIABBHELADOgcIABCwAxBDOg4IABCxAxCDARDJAxCRAjoFCAAQkgM6BQgAEJECOgsIABCxAxCDARCRAjoICAAQsQMQgwE6DggAEIAEELEDEIMBEMkDSgQIQRgASgQIRhgAUKEHWLkWYI4eaAJwAngAgAGyAogB2Q6SAQcwLjUuMy4xmAEAoAEByAEKwAEB&sclient=gws-wiz");

		Thread.sleep(10000);

		List<WebElement> svgList = driver
				.findElements(By.xpath("(//*[local-name()='svg' and @class='uch-psvg'])[1]//*[name()='rect']"));

		System.out.println(svgList.size());

		Actions act = new Actions(driver);

		for (WebElement ele : svgList) {
			act.moveToElement(ele).perform();
			System.out.println(driver.findElement(By.xpath("//div[@class='ExnoTd']")).getText());

		}

	}

}
