package package2.DesignPattern.Decorator_Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	private WebDriver driver;
	private WebElementDecorator webElementActions;

	@FindBy(id = "input-email")
	private WebElement usernameInput;

	@FindBy(id = "input-password")
	private WebElement passwordInput;

	@FindBy(xpath = "//input[@value='Login']")
	private WebElement loginButton;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		webElementActions = new WebElementActions();

		// chain decorators:waitDecorator wraps LoggingDecorator which wraps
		// WebElementActions
		webElementActions = new WaitDecorator(new LoggingDecorator(new WebElementActions()), driver);
		webElementActions = new LoggingDecorator(new WebElementActions());
	}

	public void login(String username, String password) {
		webElementActions.sendKeys(usernameInput, username);
		webElementActions.sendKeys(passwordInput, password);
		webElementActions.click(loginButton);
	}
}
