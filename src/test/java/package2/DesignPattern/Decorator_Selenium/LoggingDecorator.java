package package2.DesignPattern.Decorator_Selenium;

import org.openqa.selenium.WebElement;

public class LoggingDecorator extends WebElementDecoratorBase {

	public LoggingDecorator(WebElementDecorator decoratedElement) {
		super(decoratedElement);

	}

	public void click(WebElement element) {
		System.out.println("Clicking on element: " + element);
		super.click(element);
	}

	public void sendKeys(WebElement element, String text) {
		System.out.println("Entering '" + text + "' into element:" + element);
		super.sendKeys(element, text);
	}

}
