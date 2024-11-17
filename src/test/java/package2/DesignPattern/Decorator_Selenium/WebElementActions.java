package package2.DesignPattern.Decorator_Selenium;

import org.openqa.selenium.WebElement;

public class WebElementActions implements WebElementDecorator {

	@Override
	public void click(WebElement element) {
		element.click();

	}

	@Override
	public void sendKeys(WebElement element, String text) {
		element.sendKeys(text);

	}

}
