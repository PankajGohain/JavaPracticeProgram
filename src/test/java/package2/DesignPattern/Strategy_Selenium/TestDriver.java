package package2.DesignPattern.Strategy_Selenium;

import org.openqa.selenium.WebDriver;

public class TestDriver {

	public static void main(String[] args) {
		
		DriverContext driverContext=new DriverContext(new LocalExecutionStrategy()); //top casting, child class object can be referred by the parent interface reference variable
		WebDriver driver=driverContext.getDriver("Chrome");
		driver.get("https://www.google.com");
		
		
		driverContext.setStrategy(new HeadlessExecutionStrategy());
		driver=driverContext.getDriver("Chrome");
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		
		
		driverContext.setStrategy(new RemoteExecutionStrategy());
		driver=driverContext.getDriver("FireFox");
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		
		
	}

}
