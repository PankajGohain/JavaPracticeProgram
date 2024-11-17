package package2.DesignPattern.Strategy_Selenium;

import org.openqa.selenium.WebDriver;

public class DriverContext {

	private TestExecutionStrategy testExecutionStrategy; //interface reference variable

	public DriverContext(TestExecutionStrategy testExecutionStrategy1) {
		this.testExecutionStrategy = testExecutionStrategy1;
	}

	// setter
	public void setStrategy(TestExecutionStrategy testExecutionStrategy2) {
		this.testExecutionStrategy = testExecutionStrategy2;
	}

	public WebDriver getDriver(String browserName) {
		return testExecutionStrategy.setupDriver(browserName);
	}

}
