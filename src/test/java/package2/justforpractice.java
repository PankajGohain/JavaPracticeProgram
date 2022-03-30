package package2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class justforpractice {

	public static void main(String[] args) {

		String abc=System.getProperty("browser", "chrome");
		
		System.out.println(abc);
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.makemytrip.com/");
		driver.findElement(By.id("fromCity"));
		
	}

}
