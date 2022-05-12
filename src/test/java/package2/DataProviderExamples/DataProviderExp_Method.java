package package2.DataProviderExamples;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

//https://www.youtube.com/watch?v=3ffNUo-_yjQ&list=PLlc_LrU50tlgMVcdTBSZXt34JavaOEY8G&index=3

public class DataProviderExp_Method {

	@DataProvider(name = "getTestData")
	public Object[][] getData(Method method) {

		Object[][] testDataSet1 = { { "user1", 8956 }, 
								    { "user2", 8976 }, 
								    { "user3", 4456 } };

		Object[][] testDataSet2 = { { "India", "Asia" }, 
									{ "Russia", "Europe" }, 
									{ "Brazil", "Africa" } };

		String methodName = method.getName();

		if (methodName.equals("TestCase1")) {
			return testDataSet1;
		} else if (methodName.equals("TestCase2")) {
			return testDataSet2;
		} else {
			return new Object[][] { { "No test data", "No test data" } };
		}

	}

}
