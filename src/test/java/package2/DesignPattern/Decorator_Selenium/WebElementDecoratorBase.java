package package2.DesignPattern.Decorator_Selenium;

import org.openqa.selenium.WebElement;

public abstract class WebElementDecoratorBase implements WebElementDecorator {

	protected WebElementDecorator decoratorElement;

	public WebElementDecoratorBase(WebElementDecorator decoratedElement) { //interface reference variable
		this.decoratorElement = decoratedElement;
	}

	public void click(WebElement element) {
		decoratorElement.click(element);
	}

	public void sendKeys(WebElement element, String text) {
		decoratorElement.sendKeys(element, text);
	}
}
