package package2.DataProviderExamples;

import org.testng.annotations.Test;

public class DummyTestCase {

	@Test(dataProvider = "getTestData", dataProviderClass = DataProviderExp_Method.class)
	public void TestCase1(String user, Integer ID) {
		System.out.println("User & ID are :" + user + "----" + ID);
	}

	@Test(dataProvider = "getTestData", dataProviderClass = DataProviderExp_Method.class)
	public void TestCase2(String country, String Continent) {
		System.out.println("country & Continent are :" + country + "----" + Continent);
	}

}
