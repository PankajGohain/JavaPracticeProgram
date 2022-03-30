package Package1;

import java.util.ArrayList;

public class SeleniumSorting {

	//You can store the default sorting in a string array like obtainedList and then sort it using collections for sortedList and lastly both.

	ArrayList<String> obtainedList = new ArrayList<>(); 
	List<WebElement> elementList= driver.findElements(By.xpath(YourLocator));
	for(webElement we:elementList){
	   obtainedList.add(we.getText);
	}
	ArrayList<String> sortedList = new ArrayList<>();   
	for(String s:obtainedList){
	sortedList.add(s);
	}
	Collections.sort(sortedList);
	Assert.assertTrue(sortedList.equals(obtainedList));
	For descending order add:

	Collections.reverse(sortedList);
	after Collections.sort(sortedList);
	
}
