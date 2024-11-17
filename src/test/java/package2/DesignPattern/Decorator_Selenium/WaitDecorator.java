package package2.DesignPattern.Decorator_Selenium;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitDecorator extends WebElementDecoratorBase {

	private WebDriver driver;

	public WaitDecorator(WebElementDecorator decoratedElement, WebDriver driver) {
		super(decoratedElement);
		this.driver = driver;

	}

	public void click(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(element));
		System.out.println("Waiting for element to be visible before clicking:" + element);
		super.click(element);

	}

	public void sendKeys(WebElement element, String text) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(element));
		System.out.println("Waiting for element to be visible before typing:" + element);
		super.sendKeys(element, text);
	}

}
