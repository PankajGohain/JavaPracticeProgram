package package2.DesignPattern.Strategy_Selenium;

import org.openqa.selenium.WebDriver;

public interface TestExecutionStrategy {
	
	WebDriver setupDriver(String browserName);

}


//https://www.digitalocean.com/community/tutorials/strategy-design-pattern-in-java-example-tutorial
//Naveen automation Strategy Design Pattern